import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Double> {
  private HashMap<String, Double> vars = new HashMap<String, Double>();

  @Override
  public Double visitProgram(CalculatorParser.ProgramContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Double visitStat(CalculatorParser.StatContext ctx) {
    Double res;
    if (ctx.expr() != null) {
      res = visit(ctx.expr());
    } else {
      res = visit(ctx.assignment());
    }
    System.out.println(res);
    return res;
  }

  @Override
  public Double visitAssignment(CalculatorParser.AssignmentContext ctx) {
    String id = ctx.ID().getText();
    Double res = visit(ctx.expr());
    vars.put(id, res);
    return res;
  }

  @Override
  public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
    return visit(ctx.expr());
  }

  @Override
  public Double visitExprOp(CalculatorParser.ExprOpContext ctx) {
    Double res = null;
    Double val1 = visit(ctx.expr(0));
    Double val2 = visit(ctx.expr(1));
    String op = ctx.op.getText();

    switch (op) {
    case "+":
      res = val1 + val2;
      break;
    case "-":
      res = val1 - val2;
      break;
    case "*":
      res = val1 * val2;
      break;
    case "/":
      res = val1 / val2;
      break;
    case "%":
      res = val1 % val2;
      break;
    }

    return res;
  }

  @Override
  public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
    return Double.parseDouble(ctx.Integer().getText());
  }

  @Override
  public Double visitExprId(CalculatorParser.ExprIdContext ctx) {
    String id = ctx.ID().getText();

    if (!vars.containsKey(id)) {
      throw new RuntimeException("Variable not found: " + id);
    }

    return vars.get(id);
  }
}

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Double> {

  @Override
  public Double visitProgram(CalculatorParser.ProgramContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Double visitStat(CalculatorParser.StatContext ctx) {
    Double res = visit(ctx.expr());
    System.out.println(res);
    return res;
  }

  @Override
  public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
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
    }

    return res;
  }

  @Override
  public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
    return visit(ctx.expr());
  }

  @Override
  public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
    return Double.parseDouble(ctx.Integer().getText());
  }

  @Override
  public Double
  visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
    Double res = null;
    Double val1 = visit(ctx.expr(0));
    Double val2 = visit(ctx.expr(1));
    String op = ctx.op.getText();

    switch (op) {
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
}

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

  @Override
  public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
    Double res = visit(ctx.expr());
    System.out.println(res);
    return res;
  }

  @Override
  public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
    return Double.parseDouble(ctx.Number().getText());
  }

  @Override
  public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
    Double res = null;
    Double n1 = visit(ctx.expr(0));
    Double n2 = visit(ctx.expr(1));
    String op = ctx.op.getText();

    switch (op) {
    case "+":
      res = n1 + n2;
      break;
    case "-":
      res = n1 - n2;
      break;
    case "*":
      res = n1 * n2;
      break;
    case "/":
      res = n1 / n2;
      break;
    }

    return res;
  }
}

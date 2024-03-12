import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyCustomListener implements ParseTreeListener {
  private StringBuilder treeBuilder = new StringBuilder();
  private int level = 0;

  @Override
  public void visitErrorNode(ErrorNode node) {
    // Handle error node
  }

  @Override
  public void visitTerminal(TerminalNode node) {
    // Handle terminal node
    ParserRuleContext parentContext = (ParserRuleContext)node.getParent();
    boolean isLastNode = parentContext.children.indexOf(node) ==
                         parentContext.children.size() - 1;
    appendNode(node.getText(), isLastNode);
  }

  @Override
  public void enterEveryRule(ParserRuleContext ctx) {
    // Handle entering rule
    boolean isLastNode =
        ctx.children.get(ctx.children.size() - 1) == ctx.exception;
    appendNode(ctx.getClass().getSimpleName(), isLastNode);
    level++;
  }

  @Override
  public void exitEveryRule(ParserRuleContext ctx) {
    // Handle exiting rule
    level--;
  }

  private void appendNode(String nodeText, boolean isLastNode) {
    // Indent based on the level in the tree
    for (int i = 0; i < level; i++) {
      treeBuilder.append("   ");
    }
    // Use the appropriate character for the last node at each level
    if (level > 0) {
      treeBuilder.append(isLastNode ? "└─ " : "├─ ");
    }
    treeBuilder.append(nodeText).append("\n");
  }

  public String getTreeString() { return treeBuilder.toString(); }
}

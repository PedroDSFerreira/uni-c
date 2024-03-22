import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyCustomListener implements ParseTreeListener {
  private StringBuilder treeBuilder = new StringBuilder();
  private List<Boolean> drawVerticalLine = new ArrayList<>();
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
    boolean isLastNode = ctx.getParent() == null ||
                         ctx.getParent().children.get(
                             ctx.getParent().children.size() - 1) == ctx;
    appendNode(ctx.getClass().getSimpleName(), isLastNode);

    ensureDrawVerticalLineSize(level);
    if (level > 0) {
      drawVerticalLine.set(level - 1, !isLastNode);
    }

    level++;
  }

  @Override
  public void exitEveryRule(ParserRuleContext ctx) {
    // Handle exiting rule
    level--;
  }

  private void appendNode(String nodeText, boolean isLastNode) {
    nodeText = escapeCharacters(nodeText);
    nodeText = colorNodeText(level, nodeText);
    if (level > 0) {
      for (int i = 0; i < level - 1; i++) {
        treeBuilder.append(drawVerticalLine.get(i) ? "   │" : "    ");
      }
      treeBuilder.append(isLastNode ? "   └─ " : "   ├─ ");
    }
    treeBuilder.append(nodeText).append("\n");
  }

  public String getTreeString() { return treeBuilder.toString(); }

  private void ensureDrawVerticalLineSize(int size) {
    while (drawVerticalLine.size() < size) {
      drawVerticalLine.add(false); // Add elements to the list if needed
    }
  }

  private String escapeCharacters(String text) {
    StringBuilder escapedText = new StringBuilder();
    for (char c : text.toCharArray()) {
      switch (c) {
      case '\n':
        escapedText.append("\\n");
        break;
      case '\r':
        escapedText.append("\\r");
        break;
      case '\t':
        escapedText.append("\\t");
        break;
      case '\b':
        escapedText.append("\\b");
        break;
      case '\f':
        escapedText.append("\\f");
        break;
      case '\\':
        escapedText.append("\\\\");
        break;
      case '\'':
        escapedText.append("\\\'");
        break;
      case '\"':
        escapedText.append("\\\"");
        break;
      default:
        escapedText.append(c);
        break;
      }
    }
    return escapedText.toString();
  }

  private String colorNodeText(int level, String nodeText) {
    String color;
    if (!nodeText.contains("Context")) {
      color = "\u001B[93m"; // Light yellow
    } else {
      color = getColorForLevel(level);
    }
    return color + nodeText + "\u001B[0m"; // Reset color
  }

  private String getColorForLevel(int level) {
    switch (level % 3) { // You can adjust the number of colors here
    case 0:
      return "\u001B[94m"; // Blue
    case 1:
      return "\u001B[96m"; // Light cyan
    case 2:
      return "\u001B[38;5;27m"; // Azure
    default:
      return "\u001B[0m"; // Default color (Reset)
    }
  }
}

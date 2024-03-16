import java.lang.reflect.Constructor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TerminalAST {
  public static void main(String[] args) throws Exception {
    if (args.length < 2) {
      System.err.println("Usage: Main <grammar-name> <input-file>");
      System.exit(1);
    }

    String grammarName = args[0];
    String inputFile = args[1];

    // Construct lexer, parser, and base listener class names dynamically
    String lexerClassName = grammarName + "Lexer";
    String parserClassName = grammarName + "Parser";
    String baseListenerClassName = grammarName + "BaseListener";

    // Load lexer class dynamically
    Class<?> lexerClass = Class.forName(lexerClassName);
    Constructor<?> lexerConstructor =
        lexerClass.getConstructor(CharStream.class);

    // Create lexer instance
    CharStream input = CharStreams.fromFileName(inputFile);
    Lexer lexer = (Lexer)lexerConstructor.newInstance(input);

    // Load parser class dynamically
    Class<?> parserClass = Class.forName(parserClassName);
    Constructor<?> parserConstructor =
        parserClass.getConstructor(TokenStream.class);

    // Create parser instance
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    Parser parser = (Parser)parserConstructor.newInstance(tokens);

    // Parse input
    ParseTree tree = invokeEntryRule(parser);

    // Load base listener class dynamically
    // Class<?> baseListenerClass = Class.forName(baseListenerClassName);
    // Constructor<?> baseListenerConstructor =
    // baseListenerClass.getConstructor(); MyCustomListener listener =
    // (MyCustomListener)baseListenerConstructor.newInstance();
    MyCustomListener listener = new MyCustomListener();

    // Create a custom listener and visit the parse tree
    ParseTreeWalker.DEFAULT.walk(listener, tree);

    // Print AST
    System.out.println(listener.getTreeString());
  }

  // Invoke entry rule dynamically
  private static ParseTree invokeEntryRule(Parser parser) throws Exception {
    String entryRuleName =
        parser.getRuleNames()[0]; // Assuming first rule is the entry rule
    return (ParseTree)parser.getClass().getMethod(entryRuleName).invoke(parser);
  }
}

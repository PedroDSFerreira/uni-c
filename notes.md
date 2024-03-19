# Step-by-step antlr compiler guide

1. Create grammar (.g4) - `antlr4 X.g4`
2. Build java classes (`antlr4-build`)
3. Test with input file

   - Check for errors: `antlr4-test X input.txt`
   - Get syntax tokens: `antlr4-test X r -tokens input.txt`
   - Get AST: `antlr4-tree X input.txt`

4. Create visitor(s) (`antlr4-visitor X ClassName OutputType`) or listener(s) (`antl4-listener X ClassName`)
5. Implement visitor(s) (ClassName.java)
6. Create main file w/visitor(s) (`antlr4-main -v VisitorClass1 VisitorClass2 ...`) or listener(s) (`antlr4-main -l ListenerClass1 ListenerClass2 ...`)
7. Build main file (`antlr4-build`)
8. Run with input (antlr4-run input.txt)

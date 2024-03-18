# Step-by-step antlr compiler guide

1. Create grammar (.g4) - `antlr4 X.g4`

2. Create visitor(s) (`antlr4-visitor X ClassName OutputType`)
3. Implement visitor(s) (ClassName.java)
4. Create main file w/visitor(s) (`antlr4-main -v VisitorClass1 VisitorClass2 ...`)
5. Build java classes (`antlr4-build`)
6. Test with input file

   - Check for errors: `antlr4-test X input.txt`
   - Get syntax tokens: `antlr4-test X r -tokens input.txt`
   - Get AST: `antlr4-tree X input.txt`

7. Run with input (antlr4-run input.txt)

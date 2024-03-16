# Step-by-step antlr compiler guide

1. Create grammar (.g4) - `antlr4 X.g4`

2. Create main file (`antlr4-main`)
3. Create visitor (`antlr4-visitor X ClassName OutputType`)
4. Implement visitor (ClassName.java)
5. Add visitor to main class
6. Build java classes (`antlr4-build`)
7. Test with input file

   - Check for errors: `antlr4-test X input.txt`
   - Get syntax tokens: `antlr4-test X r -tokens input.txt`
   - Get AST: `antlr4-tree X input.txt`

8. Run with input (antlr4-run input.txt)

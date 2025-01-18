# Tema **SetLang**, grupo **setlang-s01**
-----

## Constituição dos grupos e participação individual global

| NMec | Nome | Participação |
|:---:|:---|:---:|
|  98584 | AFONSO SILVA CASTANHETA | 30% |
|  98543 | LUÍS PEDRO DA SILVA SOARES OLIVEIRA | 30% |
|  98620 | PEDRO DUARTE SOARES FERREIRA | 40% |

## Relatório

# Desenvolvimento da Linguagem

A metodologia adotada para o desenvolvimento da linguagem abrange as seguintes etapas:

1. Definição da gramática;
2. Implementação do analisador léxico e sintático;
3. Desenvolvimento dos StringTemplates;

### Componentes da Gramática

1. **Instruções (`stat`):**
   - **Declaração e Atribuição de Variável:**
     - **DeclareAssign:** Declara uma variável com um tipo específico e atribui-lhe um valor (`type ID ':=' expr`).
     - **Declare:** Declara uma variável com um tipo específico sem atribuir um valor (`type ID`).
     - **Assign:** Atribui um valor a uma variável já declarada (`ID ':=' expr`).
   - **Operação de I/O:**
     - **Write:** Produz o valor de uma expressão (`'writeln' expr`).

2. **Expressões (`expr`):**
   - **Operação Unária:** Realiza operações unárias (`+' | '-' | '#'`) numa expressão.
   - **Multiplicação e Divisão:** Lida com multiplicação, divisão e outras operações relacionadas (`'*'|'/'|'//'|'\\'|'&'`).
   - **Adição e Subtração:** Lida com adição e subtração (`'+' | '-'`).
   - **Conversão de Tipo:** Converte uma expressão para um tipo especificado (`type '(' expr ')'`).
   - **Operação de Leitura:** Lê entrada de um tipo especificado a partir de uma string (`'read' STRING`).
   - **Construção de Conjunto:** Constrói um conjunto a partir de uma lista de expressões (`set`).
   - **Valores Literais:** Representa números reais (`REAL`), inteiros (`INTEGER`), strings (`STRING`) e identificadores de variáveis (`ID`).

3. **Conjuntos (`set`):**
   - Define um conjunto como uma coleção de expressões (`'{' expr (',' expr)* '}'`).

4. **Tipos (`type`):**
   - Especifica um tipo, que pode ser um tipo base (`BTYPE`) ou um conjunto de um tipo base `'set<BTYPE>'`.

5. **Tipos Base (`BTYPE`):**
   - Define tipos de dados básicos: `integer`, `text` e `real`.

### Templates do Grupo `main`

1. **`mainClass(stat)`:**
   - Gera o esqueleto de uma classe Java chamada `Output`, que importa os pacotes necessários, define um `Scanner` para entrada e inclui um método `main` onde as instruções fornecidas (`stat`) são inseridas.

2. **`stats(stat)`:**
   - Processa uma lista de instruções (`stat`) e junta-as com um separador de nova linha se `stat` não estiver vazio.

### Templates do Grupo `stats`

1. **`declare(type, id, isSet)`:**
   - Gera código para declarar uma variável com o tipo e id fornecidos. Se `isSet` for verdadeiro, inicializa a variável como um `HashSet`.

2. **`assign(stat, id, value)`:**
   - Gera código para atribuir um valor a uma variável. Primeiro processa quaisquer instruções anteriores (`stat`).

3. **`print(stat, message)`:**
   - Gera código para imprimir uma mensagem no console. Primeiro processa quaisquer instruções anteriores (`stat`).

4. **`numericBinaryExpr(stat, type, var, e1, op, e2)`:**
   - Gera código para uma expressão numérica binária, atribuindo o resultado a uma variável. Primeiro processa quaisquer instruções anteriores (`stat`).

5. **`numericUnaryExpr(stat, type, var, op, e)`:**
   - Gera código para uma expressão numérica unária, atribuindo o resultado a uma variável. Primeiro processa quaisquer instruções anteriores (`stat`).

6. **`addSetElement(stat, id, element, addAll)`:**
   - Gera código para adicionar um elemento a um conjunto. Se `addAll` for verdadeiro, usa o método `addAll` em vez de `add`. Primeiro processa quaisquer instruções anteriores (`stat`).

7. **`setOperation(stat, e1, op, e2, isAssignment)`:**
   - Gera código para operações com conjuntos como união, interseção, etc. Se `isAssignment` for falso, adiciona um ponto e vírgula no final. Primeiro processa quaisquer instruções anteriores (`stat`).

8. **`readInput(id, message)`:**
   - Gera código para ler a entrada do usuário, exibindo uma mensagem e armazenando a entrada numa variável.

---

## Contribuições

| NMec  | Nome              | Participação | Contribuição Detalhada |
|:---:|:---|:---|:---:|
| 98584 | Afonso Castanheta | 30%             | TODO|
| 98543 | Luís Oliveira     | 30%             | TODO|
| 98620 | Pedro Ferreira    | 40%             | TODO|


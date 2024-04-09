grammar Calculator;
program:
    stat* EOF;
stat:
    (expr|assignment)? NEWLINE;
assignment: ID '=' expr;
expr :
    expr op=('*'|'/'|'%') expr  #ExprOp
    | expr op=('+'|'-') expr    #ExprOp
    | Integer                   #ExprInteger
    | '(' expr ')'              #ExprParent
    | ID                        #ExprId
    ;
Integer: [0-9]+; //implement with long integers
ID: [a-zA-Z_]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;

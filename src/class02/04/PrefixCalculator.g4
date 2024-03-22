grammar PrefixCalculator;
program:
    stat* EOF; // match zero or more statements
stat:
    expr? NEWLINE; // an expression followed by a newline
expr:
    op=('+'|'-'|'*'|'/') expr expr  #ExprPrefix
    | Number                        #ExprNumber
    ;
Number: [0-9]+ ('.' [0-9]+)?;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;

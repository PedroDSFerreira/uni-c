grammar SuffixCalculator;
program:
    stat* EOF; // match zero or more statements
stat:
    expr? NEWLINE; // an expression followed by a newline
expr:
    expr expr op=('+'|'-'|'*'|'/')  #ExprSuffix
    | Number                        #ExprNumber
    ;
Number: [0-9]+ ('.' [0-9]+)?;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;

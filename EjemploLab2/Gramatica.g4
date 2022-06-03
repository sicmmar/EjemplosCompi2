grammar Gramatica;

// tokens

INT : [0-9]+ ;
STRING : '"' (~["\r\n] | '""')* '"' ;
WS : [ \n\t]+ -> skip;

// producciones

inicio : '(' num=e ')';

e : INT;
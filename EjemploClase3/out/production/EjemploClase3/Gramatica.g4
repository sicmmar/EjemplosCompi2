grammar Gramatica;

INT     : [0-9]+ ;
IDEN    : [_a-zA-Z][a-zA-Z0-9_]* ;
STRING  : '"' (~["\r\n] | '""')* '"' ;
WS      : [ \t\r\n]+ -> skip ;

start : linstrucciones ;

linstrucciones : instrucciones linstrucciones
        | instrucciones
        ;

instrucciones : block #blck
        | declaration #decl
        ;

block : '{' linstrucciones '}' ;

declaration : type IDEN '=' expr ';' ;

type : 'int'
    | 'string'
    ;

expr : left=expr op=('*'|'/') right=expr #opExpr
   | left=expr op=('+'|'-') right=expr #opExpr
   | '(' expr ')'                      #parenExpr
   | atom=INT                          #atomExpr
   | str=STRING                        #strExpr
   ;
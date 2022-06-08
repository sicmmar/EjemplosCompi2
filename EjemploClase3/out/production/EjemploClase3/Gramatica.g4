grammar Gramatica;

options { caseInsensitive = true; }
INT     : [0-9]+ ;
IDEN    : [a-zA-Z0-9_]+ ;
STRING  : '"' (~["\r\n] | '""')* '"' ;
WS      : [ \t\r\n]+ -> skip ;

start : linstrucciones ;

linstrucciones : instrucciones linstrucciones
        | instrucciones
        ;

instrucciones : block #blck
        | declaration #decl
        | print #pr
        ;

print : 'imprimir' '(' expr ')' ';'
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
   | id=IDEN                           #idExpr
   ;
grammar Gramatica;

options { caseInsensitive = true; }

INTR    : 'int';
STRINGR : 'string' ;
IMPRIMIR : 'imprimir' ;
SUBR    : 'subroutine' ;
ENDR    : 'end' ;
INTENT  : 'intent';
IN      : 'in';

INT     : [0-9]+ ;
IDEN    : [a-zA-Z0-9_]+ ;
STRING  : '"' (~["\r\n] | '""')* '"' ;
WS      : [ \t\r]+ -> skip ;

start : linstrucciones ;

linstrucciones : instrucciones (instrucciones) *
        ;

instrucciones : block
        | declaration
        | print
        | subroutine
        | call
        ;

subroutine : SUBR id1=IDEN '(' lexpr ')' '\n' 'implicit' 'none' '\n' ldeclP linstrucciones ENDR SUBR id2=IDEN '\n'
;

ldeclP : declParameters+ ;

declParameters : type ',' INTENT '(' IN ')' ':' ':' IDEN '\n';

call : 'call' IDEN '(' lexpr ')' '\n' ;

lexpr : expr ( ',' expr )*
;

print : IMPRIMIR '(' expr ')' '\n'
        ;

block : '{' '\n' linstrucciones '}' '\n';

declaration : type IDEN '=' expr '\n' ;

type : INTR
    | STRINGR
    ;

expr : left=expr op=('*'|'/') right=expr #opExpr
   | left=expr op=('+'|'-') right=expr #opExpr
   | '(' expr ')'                      #parenExpr
   | atom=INT                          #atomExpr
   | str=STRING                        #strExpr
   | id=IDEN                           #idExpr
   | IDEN '(' lexpr ')'                #funcExpr
   ;
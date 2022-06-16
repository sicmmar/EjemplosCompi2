#include <stdio.h>
#include <math.h>
double HEAP[30101999];
double STACK[30101999];
double P;
double H;
double t0,t1,t2,t3;

void imprimir_cadena(){
t2 = STACK[(int)P];
L1:
	t3 = HEAP[(int)t2];
	if (t3!=-1) goto L2; goto L3;
	L2:
	printf("%c",(char)t3);
	t2 = t2 + 1;
	goto L1;
L3:
return;
}

void main(){
	t0 = H ;
	HEAP[(int)H] = 72 ;
	H = H + 1 ;
	HEAP[(int)H] = 101 ;
	H = H + 1 ;
	HEAP[(int)H] = 108 ;
	H = H + 1 ;
	HEAP[(int)H] = 108 ;
	H = H + 1 ;
	HEAP[(int)H] = 111 ;
	H = H + 1 ;
	HEAP[(int)H] = 32 ;
	H = H + 1 ;
	HEAP[(int)H] = 87 ;
	H = H + 1 ;
	HEAP[(int)H] = 111 ;
	H = H + 1 ;
	HEAP[(int)H] = 114 ;
	H = H + 1 ;
	HEAP[(int)H] = 108 ;
	H = H + 1 ;
	HEAP[(int)H] = 100 ;
	H = H + 1 ;
	HEAP[(int)H] = -1 ;
	H = H + 1 ;
	t1 = P + 0 ;
	STACK[(int)t1] = t0 ;
	P = P + 0 ;
	imprimir_cadena();
	P = P - 0 ;
return; 
 }
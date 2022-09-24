#include<stdio.h>

#define PrintEntero(x) printf("%d\n", x)
#define PrintFloat(x) printf("%f\n", x)
#define PrintLong(x) printf("%lx\n", x)
#define PrintChar(x) printf("%s\n", x)

#define L sizeof(struct R)

struct R {
    int a;
    float b;
    long c;
    char *p;
};

void copiar(char *a, char *b) {
    while(*a++ = *b++);
}

int main() {

    int i = 10;
    struct R *q;

    q = (struct R *) malloc(L);
    q -> a = 8;
    q -> b = 10.31;
    q -> c = 0x4832aL;
    q -> p = malloc(i);
    copiar(q -> p, "TOTALES");
    
    PrintEntero(q -> a);
    PrintFloat(q -> b);
    PrintLong(q-> c);
    PrintChar(q -> p);

    return 0;
}
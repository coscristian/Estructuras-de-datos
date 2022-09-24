#include<stdio.h>
#include<stdlib.h>

void copiar(char *a, char *b) {
    while(*a++ = *b++);
}

void main() {

    char *p, *q;
    int n = 50;

    void copiar(char *a, char *b); 
    
    p = (char *) malloc(n);
    copiar(p, "pascal");

    q = (char *)malloc(n);
    copiar(q, "LenguajeC");
    
    printf("Start Memory Dir: \n");
    
    printf("\tMemory Dir of P: %p\n", p);
    
    printf("\t\tValue of P: %s\n", p); 

    printf("\tMemory Dir of Q (C): %p\n", q);
    printf("\t\tValue of Q: %s\n\n", q);
    
    /* Libera la memoria a la que apunta q */
    free(q);
    
    printf("After cleaning the memory of Q (C)\n");
    
    printf("\tMemory Dir of Q (C): %p\n", q);
    printf("\t\tValue of Q: %s\n\n", q); 

    q = p;

    printf("Final Memory Dir: \n");
    
    printf("\t\tMemory Dir of P: %p\n", p);
    printf("\t\tValue of P: %s\n", p); 

    printf("\t\tMemory Dir of Q: %p\n", q);
    printf("\t\tValue of Q: %s\n\n", q); 
}
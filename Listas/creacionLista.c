#include<stdlib.h>

#define p1(x) printf("%d - ", x)
#define localizar (struct node *) malloc(sizeof(struct node))

struct node {
    int info;
    struct node *next;
};

void write_list(struct node *p) {
    while( p != NULL) {
        p1(p -> info);
        p = p -> next;
    }
}

void create_list(struct node **p, int i) {
    struct node *q;
    *p = NULL;
    
    while(i > 0) {
        q = localizar;
        q -> info = i;
        q -> next = *p;
        *p = q;
        i -= 1;
    }
}

void main() {

    /* Declarations */
    struct node *head;
    void write_list(struct node *q);
    void create_list(struct node **p, int i);

    create_list(&head, 10);
    write_list(head);
    
    printf("\n");
    return 0;
}
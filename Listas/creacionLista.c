#include<stdlib.h>

#define p1(x) printf("%d - ", x)
#define locate (struct node *) malloc(sizeof(struct node))

struct node {
    int info;
    struct node *next;
};

// Function to insert a int value and keep the linked list in an ascending order
void keep_ascending(struct node **head, int n) {
    struct node *p, *q;
    int found;

    p = NULL;
    q = *head;
    found = 0;
    while((q != NULL) && (!found)) {
        if(n > q -> info) {
            p = q;
            q = q -> next;
        }else
            found = 1;
    }
    if(found) {
        if(n == q -> info)
            printf("Duplicated value\n");
        else
            insert_between_nodes(head, p, q, n);
    }else
        insert_between_nodes(head, p, q, n);
}


void insert_between_nodes(struct node **head, struct node *p, struct node *q, int n) {
    struct node *new;
    new = locate;
    new -> info = n;
    new -> next = q;
    if (p != NULL){
        p -> next = new;
    }else{
        *head = new;
    }
}

void insert_before(struct node *p, int n) {
    struct node *new;

    if(p == NULL) {
        printf("Can't be inserted");
    }else{
        new = locate;
        new -> info = p -> info;
        new -> next = p -> next;
        p -> info = n;
        p -> next = new;
    }
}

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
        q = locate;
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
    void insert_before(struct node *p, int n);
    void insert_between_nodes(struct node **head, struct node *p, struct node *q, int n);
    void keep_ascending(struct node **head, int n);

    int n;

    head = NULL;
    
    // Inserting values in the linked list (Must keep it in an ascending order)
    printf("Type number to insert in linked list: ");
    scanf("%d", &n);
    while(n != 9999) {
        keep_ascending(&head, n);
        printf("Type number to insert in linked list: ");
        scanf("%d", &n);
    }

    write_list(head);

    printf("\n");
    return 0;
}
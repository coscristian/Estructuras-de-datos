#include<stdlib.h>
#include <stdio.h>

#define locate (struct node *) malloc(sizeof(struct node))
#define p1(x) printf("%d - ", x)
#define clear() printf("\033[H\033[J")


struct node {
    int info;
    struct node *next;
};

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


void createLinkedList(struct node **head) {
    int v;
    while(scanf("%d", &v) && v != -1) {
        keep_ascending(head, v); // Filling the linked list
    } 
}

void showLinkedList(struct node *head){
    while(head != NULL){
        printf("%d - ", head->info);
        head = head->next;
    }
}

void show_menu() {
    printf(".: MAIN MENU :.\n");
    printf("0. Create Linked List\n");
    printf("1. Exercise 1\n");
    printf("2. Exercise 2\n");
    printf("3. Exercise 3\n");
    printf("4. Exercise 4\n");
    printf("5. Exercise 5\n");
    printf("6. Exercise 6\n");
    printf("7. Exercise 7\n");
    printf("8. Exercise 8\n");
    printf("9. Exercise 9\n");
    printf("10. Exercise 10\n");
    printf("Select an option: ");
}

struct node * exercise1(struct node *head, int x) {
    struct node *aux = head;
    
    while(aux != NULL){
        if(aux->info == x)
            return aux;
        aux = aux->next;
    }
    return NULL;
}

int exercise2(struct node *head) {
    int count = 0;
    while(head != NULL) {
        count++;
        head = head->next;
    }
    return count;
}

// Concatenate two linked list, given the head of the first and the head of the second
void exercise3(struct node **head1, struct node *head2) {
    struct node *aux1 = *head1;

    if (aux1 != NULL){
        while(aux1->next != NULL){
            aux1 = aux1->next;
        }
        aux1->next = head2;
    }else{
        *head1 = head2;
    }
}


int main() {

    struct node * exercise1();
    void keep_ascending(struct node **head, int n);
    void insert_between_nodes(struct node **head, struct node *p, struct node *q, int n);

    // Create Linked list (Insert values)
    struct node *head = NULL;

    int option,s;

    do{
        clear();
        show_menu();
        scanf("%d", &option);

        switch (option) {
            case 0:
                createLinkedList(&head);
                showLinkedList(head);
                break;
            case 1:     // Exercise 1   
                if(head != NULL){
                    int x;
                    
                    printf("Input the value: ");
                    scanf("%d", &x);
                    
                    struct node *val;
                    val = exercise1(head, x);
                    
                    printf("\n------------\n");
                    if (val != NULL) {
                        printf("Memory address: %p", val);
                        printf("Value: %d", val->info);
                    }else{
                        printf("Value not found");
                    }
                    printf("\n------------\n");
                    break;
                }            
            case 2:     // Exercise 2
                printf("This linked list is composed by %d nodes", exercise2(head));
                break;
            case 3: ;     // Exercise 3
                struct node *head2 = NULL;
                createLinkedList(&head2);
                exercise3(&head, head2);
                showLinkedList(head);
                break;
            case 4:     // Exercise 4
                
                break;
            case 5:     // Exercise 5
                
                break;
            case 6: // Exercise 6
                
                break;
            case 7: // Exercise 7
                
                break;
            case 8: // Exercise 8
                
                break;
            default:
                break;
        }
        printf("\n------------\n");
        printf("PRESS A KEY TO CONTINUE");
        printf("\n------------\n");
        scanf("%d", &s);

    }while(option != -1);

    printf("GOOD BYE !!");
    return 0;
}
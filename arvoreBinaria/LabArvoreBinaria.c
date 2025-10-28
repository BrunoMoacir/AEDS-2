#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct No {
    int elemento;
    struct No *esq, *dir;
} No;

No* novoNo(int x) {
    No* novo = (No*)malloc(sizeof(No));
    novo->elemento = x;
    novo->esq = novo->dir = NULL;
    return novo;
}

No* inserir(int x, No* i) {
    if (i == NULL) {
        i = novoNo(x);
    } else if (x < i->elemento) {
        i->esq = inserir(x, i->esq);
    } else if (x > i->elemento) {
        i->dir = inserir(x, i->dir);
    }
    return i;
}

int pesquisar(int x, No* i) {
    int resp = 0;

    if (i != NULL) {
        printf("%d ", i->elemento);

        if (x == i->elemento) {
            resp = 1;
        } else if (x < i->elemento) {
            resp = pesquisar(x, i->esq);
        } else {
            resp = pesquisar(x, i->dir);
        }
    }

    return resp;
}

void caminharPre(No* i) {
    if (i != NULL) {
        printf("%d ", i->elemento);
        caminharPre(i->esq);
        caminharPre(i->dir);
    }
}

void caminharEm(No* i) {
    if (i != NULL) {
        caminharEm(i->esq);
        printf("%d ", i->elemento);
        caminharEm(i->dir);
    }
}

void caminharPos(No* i) {
    if (i != NULL) {
        caminharPos(i->esq);
        caminharPos(i->dir);
        printf("%d ", i->elemento);
    }
}

void liberar(No* i) {
    if (i != NULL) {
        liberar(i->esq);
        liberar(i->dir);
        free(i);
    }
}

int main() {
    No* raiz = NULL;
    char comando[10];
    int x;

    while (scanf("%s", comando) != EOF) {
        if (strcmp(comando, "I") == 0) {
            scanf("%d", &x);
            raiz = inserir(x, raiz);
        } 
        else if (strcmp(comando, "P") == 0) {
            scanf("%d", &x);
            int achou = pesquisar(x, raiz);
            if (achou)
                printf("S\n");
            else
                printf("N\n");
        } 
        else if (strcmp(comando, "PRE") == 0) {
            if (raiz == NULL)
                printf("v\n");
            else {
                caminharPre(raiz);
                printf("\n");
            }
        } 
        else if (strcmp(comando, "POS") == 0) {
            if (raiz == NULL)
                printf("v\n");
            else {
                caminharPos(raiz);
                printf("\n");
            }
        } 
        else if (strcmp(comando, "EM") == 0) {
            if (raiz == NULL)
                printf("v\n");
            else {
                caminharEm(raiz);
                printf("\n");
            }
        }
    }

    liberar(raiz);
    return 0;
}

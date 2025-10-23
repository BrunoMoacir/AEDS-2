#include <stdio.h>
#include <stdlib.h>

typedef struct Celula{// define a celula
    int elemento;
    struct Celula* prox;
} Celula;

typedef struct Pilha{// define a pilha
    Celula* topo;
} Pilha;

Pilha* criarPilha(){
    Pilha* p = (Pilha*)malloc(sizeof(Pilha));
    p->topo = NULL;
    return p;
}

void empilhar(Pilha* p, int x){
    Celula* nova = (Celula*)malloc(sizeof(Celula));
    nova->elemento = x;
    nova->prox = p->topo;// aponta para o antigo topo
    p->topo = nova;// atualiza o topo
}

int desempilhar(Pilha* p){
    if(p->topo == NULL){
        printf("-1\n");// pilha vazia
        return -1;
    }
    Celula* tmp = p->topo;
    int elemento = tmp->elemento;
    p->topo = tmp->prox;// movi o topo
    free(tmp);
    printf("%d\n", elemento);
    return elemento;
}

void mostrar(Pilha* p){
    if(p->topo == NULL){
        printf("V");// vazia
    } else{
        for(Celula* i = p->topo; i != NULL; i = i->prox){
            printf("%d ", i->elemento);
        }
        printf("\n");
    }
}

int pesquisar(Pilha* p, int x){
    for(Celula* i = p->topo; i != NULL; i = i->prox){
        if(i->elemento == x)
            return 1;// encontrado
    }
    return 0;// nao encontro
}
int main(){
    Pilha* pilha = criarPilha();
    char comando;
    int num;

    while(scanf(" %c", &comando) != EOF) {
        switch(comando){
            case 'E':// empilhar
                scanf("%d", &num);
                empilhar(pilha, num);
                break;
            case 'D':
                desempilhar(pilha);
                break;
            case 'M':// pesquisa
                scanf("%d", &num);
                if(pesquisar(pilha,num))
                    printf("S\n");
                else
                    printf("N\n");
                break;
            case 'P'://mostra
                mostrar(pilha);
                break;
        }
    }
    return 0;
}
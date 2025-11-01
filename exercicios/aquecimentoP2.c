#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
    char nome[50];
    int peso;
}Atleta;

int main(){
    int qtAtletas;
    scanf("%d", &qtAtletas);

    Atleta vetor[qtAtletas];// crio vetor de Atleta

    for(int i = 0; i < qtAtletas; i++){
        scanf("%s", &vetor[i].nome);
        scanf("%i", &vetor[i].peso);
    }
    //ordenacao + alfabeto
    for(int j = qtAtletas - 1; j > 0; j --){
        for(int k = 0; k < j; k ++){
            if(vetor[k].peso < vetor[k + 1]){
                Atleta tmp = vetor[k];
                vetor[k] = vetor[k + 1];
                vetor[k + 1] = tmp;
            } else if(vetor[k].peso == vetor[k + 1].peso){
                if(strcmp(vetor[k].nome, vetor[k + 1].nome) > 0){
                    Atleta tmp = vetor[k];
                    vetor[k] = vetor[k + 1];
                    vetor[k + 1] = tmp;
                }
            }
        }
    }
    for(int bmchef = 0; bmchef < qtAtletas; bmchef ++){
        printf("%s %d\n", vetor[i].nome, vetor[i].peso);
    }
}
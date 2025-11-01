#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
    char nome[50];
    int peso;
}Atleta;

int main(){
    Atleta atletas[100];
    int i = 0;

    while(scanf("%s %d", atletas[i].nome, &atletas[i].peso) != EOF){
        i++;// pego o tamanho para conseguir fazer a ordenacao bolha
    }

    for(int k = i - 1; k > 0; k--){
        for(int j = 0; j < k; j++){
            if(atletas[j].peso < atletas[j + 1].peso){
                Atleta tmp = atletas[j];
                atletas[j] = atletas[j + 1];
                atletas[j + 1] = tmp;
            } else if(atletas[j].peso == atletas[j + 1].peso){
                if(strcmp(atletas[j].nome,atletas[j+1].nome) > 0){
                    Atleta tmp = atletas[j];
                    atletas[j] = atletas[j + 1];
                    atletas[j + 1] = tmp;
                }
            }
        }
    }
    for(int b = 0; b < i; b++){
        printf("%s %d\n", atletas[b].nome, atletas[b].peso);
    }
}
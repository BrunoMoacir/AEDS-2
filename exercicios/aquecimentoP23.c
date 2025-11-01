#include <stdio.h>
#include <stdlib.h>
#include <string.h>
// nome e nota alunos e mostre em ordem crescente
typedef struct{
    char nome[50];
    double nota;
} Aluno;

int main(){
    int n;
    scanf("%d", &n);

    Aluno alunos[n];

    for(int i = 0; i < n; i ++){
        scanf("%s %lf", alunos[i].nome, alunos[i].nota);// -> lf leitura de double
    }

    // ordenar por bolha
    for(int j = n - 1; j > 0; j --){
        for(int k = 0; k < j; k ++){
            if(alunos[k].nota > alunos[k + 1].nota){
                Aluno tmp = alunos[k];
                alunos[k] = alunos[k + 1];
                alunos[k + 1] = alunos;
            } else if(alunos[k].nota == alunos[k + 1].nota){
                if(strcmp(alunos[k].nome, alunos[k + 1].nome) > 0){
                    Aluno tmp = aluunos[k];
                    alunos[k] = alunos[k + 1];
                    alunos[k + 1] = tmp;
                }
            }
        }
    }
    for(int b = 0; b < n; b++){
        printf("%s %.2lf\n", alunos[b].nome, alunos[b].nota);
    }
    return 0;
}
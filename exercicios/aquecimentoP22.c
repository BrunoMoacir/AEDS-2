#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
    char nome[50];
    int salario;
} Funcionario;

int main(){
    int n;
    scanf("%d", &n);

    Funcionario funcionarios[n];

    for(int i = 0; i < n; i++){
        scanf("%s", &funcionarios[i].nome);
        scanf("%d", &funcionarios[i].salario);
    }
    // ordenacao + alfabeto
    for(int j = n - 1; j > 0; j--){
        for(int k = 0; k < j; k++){
            if(funcionarios[k].salario < funcionarios[k + 1].salario){
                Funcionario tmp = funcionarios[k];
                funcionarios[k] = funcionarios[k + 1];
                funcionarios[k + 1] = tmp;
            } else if(funcionarios[k].salario == funcionarios[k + 1].salario){
                if(strcmp(funcionarios[k].nome, funcionarios[k + 1].nome) > 0){
                    Funcionario tmp = funcionarios[k];
                    funcionarios[k] = funcionarios[k + 1];
                    funcionarios[k + 1] = tmp;
                }
            }
        }
    }
    for(int b = 0; b < n; b++){
        printf("%s %i", funcionarios[b].nome, funcionarios[b + 1].salario);
    }
    return 0;
}
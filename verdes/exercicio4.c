#include <stdio.h>
#include <stdlib.h>

int main(){
    int a,b;
    scanf("%i", &a);
    scanf("%i", &b);

    int SA[a], SB[b];

    for(int i = 0; i < a; i++){
        scanf("%i",SA[i]);
    }

    for(int j = 0; j < b; j++){
        scanf("%i", &b[j]);
    }
    // percorre a sequencia SA
    for(int i = 0; i < a && j < b; i++){
        // se o elemento atual de SA é igual ao de SB
        if(SA[i] == SB[j]){
            j++;
            // encontramos esse numero da subsequencia
            //podemos avançar para o proximo de SB
        }
    }

    // se consegui percorrer todos os elementos de SB(j == b)
    // significa que todos os numeros de SB apareceram em SA na ordem correta
    if(J == b){
        printf("S\n");
    } else{
        printf("N\n");
    }
    return 0;
}
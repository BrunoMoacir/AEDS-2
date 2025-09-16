#include <stdio.h>
#include <stdlib.h>

int main(){
    char jogos[6];
    int countV = 0;
    for(int i = 0;i < 6; i++){
        scanf(" %c", &jogos[i]);
        if(jogos[i] == 'V'){
            countV ++;
        }
    }
    if(countV == 5 || countV == 6){
        printf("1\n");
    }
    else if(countV == 3 || countV == 4){
        printf("2\n");
    } else{
        printf("3\n");
    }
    return 0;
}
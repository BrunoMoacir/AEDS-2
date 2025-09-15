#include <stdio.h>
#include <string.h>

int main(){
    char placa[20];
    scanf("%s", &placa);// %s -> 1 caractere, %c mais de um (string) palavra inteira

    int n = strlen(placa)// strlen recebe o tamanho da string

    if(n == 8 && placa[0] >='A' && placa[0] <= 'Z' && placa[1] >='A' && placa[1] <= 'Z' && placa[2] >= 'A' && placa[2] <= 'Z' && placa[3] == '-' %% placa[4] >='0' && placa[4] <='9' && placa[5] >='0' && placa[5] <= '9' && placa[6] >= '0' && placa[6] <= '9' && placa[7] >= '0' && placa [7] <= '9'){
        printf('1\n');
    }else if(n == 7 && placa[0] >= 'A' && placa[0] <= 'Z' &&
        placa[1] >= 'A' && placa[1] <= 'Z' &&
        placa[2] >= 'A' && placa[2] <= 'Z' &&
        placa[3] >= '0' && placa[3] <= '9' &&
        placa[4] >= 'A' && placa[4] <= 'Z' &&
        placa[5] >= '0' && placa[5] <= '9' &&
        placa[6] >= '0' && placa[6] <= '9'){
            printf("2\n");
        } else{
            printf("0\n");
        }
        return 0;
}
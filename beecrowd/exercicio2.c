#include <stdio.h>

int numCarateres(char* s){
    int len = 0;
    while(s[len] != '\0'){
        len++;
    }
    return len;
}

void removerNewLine(char s[]){
    int i = 0;
    while(s[i] != '\n' && s[i] != '\0'){
        i++;
    }
    if(s[i] == '\n'){
        s[i] = '\0';
    }
}

int funcao(char* str1, char* str2){
    int tam1 = numCaracteres(str1);
    int tam2 = numCaracteres(str2);
    int resposta = 0;

    for(int i = 0; i < tam1; i++){
        char c = str1[i];
        for(int j = 0; j < tam2; j++){
            if(str[2] == c){
                resposta++;
            }
        }
    }
    return resposta;
}

int main(){
    char str1[100];
    char str2[100];

    while(fgets(str1, 100, stdin) != NULL && fgets(str2, 100, stdin) != NULL){
        removerNewLine(str1);
        removerNewLine(str2);

        int resp = funcao(str1, str2);

        printf("%d\n", resp);
    }
    return 0;
}
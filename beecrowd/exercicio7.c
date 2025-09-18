#include <stdio.h>

int main(){
    int h1,m1,h2,m2;
    while(scanf("%d %d %d %d", h1,m1,h2,m2) != EOF){
        if(h1 == 0){
            break;
        } 
        int minutosInicio = h1 * 60 + m1;
        int minutosAlarme = h2 * 60 + m2;
        int minutosSono;
        if(minutosAlarme <= minutosInicio){
            minutosSono = (1440 - minutosInicio) + minutosAlarme;
        }else{
            minutosSono = minutosAlarme - minutosInicio;
        }
        printf("%d\n", minutosSono);
    }
    return 0;
}
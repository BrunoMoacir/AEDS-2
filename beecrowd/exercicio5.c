#include <stdio.h>

int main(){
    int n;

    while(scanf("%d", &n) != EOF){
        long long tempoCpuLivre = 0;
        long long tempoTotalEspera = 0;

        for(int i = 0; i < n; i++){
            int t,c;
            scanf("%d %d", &t, &c);

            long long tempoInicioExecucao;
            if(t > tempoCpuLivre){
                tempoInicioExecucao = t;
            } else{
                tempoInicioExecucao = tempoCpuLivre;
            }

            long long tempoEspera = tempoInicioExecucao - t;
            tempoTotalEspera += tempoEspera;

            tempoCpuLivre = tempoInicioExecucao + c;
        }
        printf("%d\n", tempoTotalEspera);
    }
    return 0;
}
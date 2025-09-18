import java.util.Scanner;

public class exercicio5 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int n = sc.nextInt();
            long tempoCpuLivre = 0;
            long tempoTotalEspera = 0;

            for(int i = 0; i < n; i++){
                int t = sc.nextInt();
                int c = sc.nextInt();

                long tempoInicioExecucao;
                
                if(t > tempoCpuLivre){
                    tempoInicioExecucao = c;
                } else{
                    tempoInicioExecucao = tempoCpuLivre;
                }
                long tempoEspera = tempoInicioExecucao - t;
                tempoTotalEspera += tempoEspera;

                tempoCpuLivre = tempoInicioExecucao + c;
            }
            System.out.println(tempoTotalEspera);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int tempoIntervalos = n - 1;// 1 minuto intervalo para n diretores
            int tempoDisponivel = k - tempoIntervalos;//subtrai o tempo dos intervalos do tempo disponivel
            int duracaoFala = tempoDisponivel / n;//divide o tempo disponivel pelo numero de diretores(k)

            System.out.println(duracaoFala);
        }
        sc.close();
    }
    
}

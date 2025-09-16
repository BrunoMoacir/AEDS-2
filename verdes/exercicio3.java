import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] pais = new String[n];
        int[] medOuro = new int[n];
        int[] medPrata = new int[n];
        int[] medBronze = new int[n];

        for(int i = 0; i < n; i ++){
            pais[i] = sc.next();
            medOuro[i] = sc.nextInt();
            medPrata[i] = sc.nextInt();
            medBronze[i] = sc.nextInt();
        }

        
        sc.close();
    }
    
}

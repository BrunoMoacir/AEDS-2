import java.util.Scanner;

public class exercicio4 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();

        int[] SA = new int[a];
        int[] SB = new int[b];

        for(int i = 0; i < a; i++){
            SA[i] = sc.nextInt();
        }

        for(int j = 0; j < b; j ++){
            SB[j] = sc.nextInt();
        }
        int j = 0;
        for(int i = 0; i < a && j < b; i++){
            if(SA[i] == SB[j]){
                j++;
            }
        }

        if(j == b){
            System.out.println("S");
        } else{
            System.out.println("N");
        }
    }
}

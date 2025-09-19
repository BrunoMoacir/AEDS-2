import java.util.Scanner;

public class questao8 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int countV = 0;
        int jogos = 0;
        while(sc.hasNextLine() && jogos < 6){
            String resultadoJogo = sc.nextLine();
            if(resultadoJogo.charAt(0) == 'V'){
                countV++;
            }
            jogos ++;
        }
        if(countV >= 5){
            System.out.println("1");
        } else if(countV >= 3){
            System.out.println("2");
        } else{
            System.out.println("3");
        }
        sc.close();
    }
    
}

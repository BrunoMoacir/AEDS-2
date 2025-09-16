import java.util.Scanner;

public class exercicio1 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int countV = 0;

        String[] resultados = new String[6];
        for(int i = 0; i < 6; i++){
            resultados[i] = sc.nextLine();
            if(resultados[i].equals("V")){
                countV ++;
            }
        }
        if(countV == 5 || countV == 6){
            System.out.println("1");
        } else if(countV == 3 || countV == 4){
            System.out.println("2");
        } else{
            System.out.println("3");
        }

    }

}
//////////////////////////////////
 se fosse com CHAR:
 char[] resultados = new char[6];
 resultados[i] = sc.nextLine().charAt(0);// le so o 1 caractere
 if(resultados[i] == 'V'){
    countV ++; 
 }

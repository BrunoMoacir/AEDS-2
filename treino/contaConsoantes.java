package treino;

import java.util.Scanner;

public class contaConsoantes {
    
    public static int contaConsoantes(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >='a' && c <='z' || c >='A' && c <='Z'){
                if(!(c == 'a' || c == 'A' || c == 'e' || c == 'E' || 
                      c == 'i' || c == 'I' || c == 'o' || c == 'O' || 
                      c == 'u' || c == 'U')){
                        count ++;
                      }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String linha = sc.nextLine();
        while(!linha.equals("FIM")){
            System.out.println(contaConsoantes(linha));
            linha = sc.nextLine();
        }
    sc.close();
    }
}

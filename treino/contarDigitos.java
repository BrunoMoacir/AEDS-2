package treino;

import java.util.Scanner;

public class contarDigitos {
    public static int contaDigitos(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >='0' && c <='9'){
                count++;
            }
        }
        return count;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String linha = sc.nextLine();
        while(!linha.equals("FIM")){
            System.out.println(contaDigitos(linha));
            linha = sc.nextLine();
        }
    }
}

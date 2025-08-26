package treino;

import java.util.Scanner;

public class verificaInteiros {
    public static String contaInteiros(String s){
        String resposta = "NÃO";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >='0' && c <='9'){
                resposta = "SIM";
            }
        }
        return resposta;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        while(!str.equals("FIM")){
            System.err.println(contaInteiros(str));
            str = sc.nextLine();
        }
    }
}

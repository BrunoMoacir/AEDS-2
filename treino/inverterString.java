package treino;

import java.util.Scanner;

public class inverterString {
    public static String inverteString(String s){
        String invertida = "";
        for(int i = s.length() - 1; i >=0; i--){
            invertida +=s.charAt(i);
        }
        return invertida;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String linha = sc.nextLine();
        while(!linha.equals("FIM")){
            System.out.println(inverteString(linha));
            linha = sc.nextLine();
        }
    }
}

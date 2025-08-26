package treino;

import java.util.Scanner;

public class contaEspaços {
    public static int contadorEspacos(String s){
        int contador = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                contador ++;
            }
        }
        return contador;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String linha = sc.nextLine();
        while(!linha.equals("FIM")){
            System.out.println(contadorEspacos(linha) + " espaços");
            linha = sc.nextLine();
        }
    }
}

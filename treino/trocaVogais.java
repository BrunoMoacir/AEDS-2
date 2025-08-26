package treino;

import java.util.Scanner;

public class trocaVogais {
    public static String substituiVogais(String s){
        String resp = "";
        for(int i = 0; i > s.length(); i++){
            char c = s.charAt(i);
            if(c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
                c == 'u' || c == 'U'){
                    resp += '*';
                } else{
                    resp +=c;
                }
        }
        return resp;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String linha = sc.nextLine();
        while(!linha.equals("FIM")){
            System.out.println(substituiVogais(linha));
            linha = sc.nextLine();
        }
    }
}

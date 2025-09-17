// ordenar string por tamanho

package beecrowd;

public class exercicio4 {  

    public static stringToInt(String s){
        int numero = 0;
        for(int i = 0; i < s.length(); i++){
            numero = numero * 10 + (s.charAt(i) - '0');
        }
        return numero;
    }
    
    
}


import java.util.Scanner;

// o programa deve processar multiplos casos de teste, ate EOF
//para cada caso tem duas linhas: uma string contendo as letras que fazem parte do alfabeto alieligena
//uma string do texto
// para cada caractere do texto, devo verificar se ha a aparicao das letras que fazem parte do alfabeto alienigena
// nao contar os espaços
// retornar a quantidade de aparicoes
public class exercicio6 {
    public static int contemCaractere(String vogais, char caractereAtual){
        int resultado = 0;
        int len = vogais.length();
        for(int i = 0; i < len; i++){
            if(vogais.charAt(i) == caractereAtual){
                resultado = 1;
            }
        }
        return resultado;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String vogais = sc.nextLine();
            String texto = sc.nextLine();
            int countVogais = 0;
            int textoLen = texto.length();

            for(int i = 0; i < textoLen; i++){
                char caractereAtual = texto.charAt(i);
                if(caractereAtual != ' '){// tira os espaços
                    if(contemCaractere(vogais, caractereAtual) == 1){
                        countVogais++;
                    }
                }
            }
            System.out.println(countVogais);
        }
        sc.close();
    }
}

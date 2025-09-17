package beecrowd;

import java.util.Scanner;

public class exercicio3 {

    public static int stringToInt(String s){
        int numero = 0;
        for(int i = 0; i < s.length(); i++){
            numero = numero * 10 + (s.charAt(i) - '0');
        }
        return numero;
    }
    public static int calcularMinimoTrocas(int[] permutacao, int n){
        boolean[] visitado = new boolean[n + 1];
        int numeroDeCiclos = 0;
        for(int i = 1; i <=n; i++){
            if(!visitado[i]){
                numeroDeCiclos++;
                int j = i;
                while(!visitado[j]){
                    visitado[j] = true;
                    j = permutacao[j - 1];
                }
            }
        }
        return n - numeroDeCiclos;
    }
    public static void main(String[] args) {
        // Lê o número de casos de teste
        int T = stringToInt(MyIO.readLine());

        for (int t = 0; t < T; t++) {
            // Lê o tamanho da sequência
            int N = stringToInt(MyIO.readLine());
            int[] permutacao = new int[N];

            // Lê a linha com a permutação
            String linha = MyIO.readLine();
            
            // --- Parsing manual da linha de números ---
            String numeroAtualStr = "";
            int arrayIndex = 0;
            for (int i = 0; i < linha.length(); i++) {
                char c = linha.charAt(i);
                if (c == ' ') {
                    // Se encontrou um espaço, converte o número e o adiciona ao array
                    permutacao[arrayIndex] = stringToInt(numeroAtualStr);
                    arrayIndex++;
                    numeroAtualStr = ""; // Limpa para o próximo número
                } else {
                    // Se não for espaço, adiciona o dígito à string do número atual
                    numeroAtualStr += c;
                }
            }
            // Adiciona o último número, que não é seguido por um espaço
            permutacao[arrayIndex] = stringToInt(numeroAtualStr);
            // --- Fim do parsing ---

            // Calcula e imprime o resultado
            MyIO.println(calcularMinimoTrocas(permutacao, N));
        }
    }
}

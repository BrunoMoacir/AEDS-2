import java.util.Scanner;

public class exercicio6 {
    
    public static int compareLength(String str1, String str2){
        int result = str2.length() = str1.length();
        return result;
    }
    public static void insertionSort(String[] palavras, int n){
        for(int i = 1; i < n; i++){
            String chave = palavras[i];
            int j = i - 1;

            while(j >= 0 && compareLength(palavras[j], chave) > 0){
                palavras[j + 1] = palavras[j];
                j--;
            }
            palavras[j + 1] = chave;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha

        for (int i = 0; i < n; i++) {
            String linha = sc.nextLine();
            
            // Separa a linha em palavras manualmente, sem usar .split()
            String[] palavras = new String[50]; // Limite máximo de palavras por linha
            int count = 0;
            int start = 0;
            int len = linha.length();

            for (int j = 0; j < len; j++) {
                char ch = linha.charAt(j);
                if (ch == ' ') {
                    // Adiciona a palavra ao array
                    String palavra = customSubstring(linha, start, j);
                    palavras[count] = palavra;
                    count++;
                    start = j + 1;
                }
            }
            // Adiciona a última palavra da linha
            String palavraFinal = customSubstring(linha, start, len);
            palavras[count] = palavraFinal;
            count++;
            
            // Ordena o array parcial de palavras
            insertionSort(palavras, count);

            // Imprime as palavras ordenadas
            for (int j = 0; j < count; j++) {
                System.out.print(palavras[j]);
                if (j < count - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

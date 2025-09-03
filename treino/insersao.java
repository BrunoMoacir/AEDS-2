import java.util.Random;

public class insersao {
    
    final static int TAM = 100;

    public static void preencheVetor(int[] vetor){
        Random rnd = new Random();
        for(int i = 0; i < TAM; i++){
            vetor[i] = rnd.nextInt(300);
        }
    }
    public static void insercao(int[] vetor, int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            int tmp = vetor[i];
            int j = i - 1;
            while((j >=0) && (vetor[j] > tmp)){
                count ++;
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = tmp;
        }
        System.out.println("A quantidade de comparacoes foi: " + count);
    }

    public static void main(String[] args){
        int[] vetor = new int[TAM];
        preencheVetor(vetor);
        System.out.println("desordenado: ");
        for(int i = 0; i < TAM; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println("%n%n");

        insercao(vetor, TAM);
        System.out.print("Ordenado: ");
        for(int i = 0; i < TAM; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println("%n%n");
    }
}

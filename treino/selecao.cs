using System;

class MainClass {

    // Define o tamanho para o vetor
    const int TAM = 7;

    /*
    * Preenche o vetor com valores aleatórios
    */
    public static void preencheVetor(int [] vetor){
        Random rnd = new Random();
        for(int i=0; i<TAM; i++)
            vetor[i] = rnd.Next(100);
    }

    /*
    * Troca elementos de lugar no vetor
    */
    public static void swap(int i, int j, int [] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

  /*
   * Pesquisa o elemento chave no vetor
   * @return true/false como retorno do método 
   */
    private static void selecao (int []vetor, int n){
        int i, j, min;
        for (i=0; i<=n-1; i++){
            min = i;
	        for (j=i+1; j<=n; j++){
                // operação relevante de comparação
                if (vetor[j] < vetor[min]) 
	                min = j;
	        }
	        swap(min, i, vetor);
        }
        
    }

    public static void Main (string[] args) {
        int[] vetor = new int[TAM]{50, 45, 40, 35, 20, 15, 5};

        //preencheVetor(vetor);
        for(int i=0; i<TAM; i++)
            Console.Write(vetor[i] + " ");
        Console.Write("\n");

        selecao(vetor, TAM -1);

        for(int i=0; i<TAM; i++)
            Console.Write(vetor[i] + " ");
    }
}
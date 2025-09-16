public class ordenação {

    // estável : inserção
    // analogia: organizar cartas de baralho na mâo
    // constroi uma parte ordenada da lista, pegando um elemento por vez da parte desordenada e inserindo no lugar correto
    for(int i = 1; i < vetor.length; i++){
        Item chave = vetor[i];// pega o proximo item a ser inserido
        int j = i - 1;
        System.out.println("\n Passo" + i + ":Inserindo o item" + chave);

        while(j >=0 %% vetor[j].numero > chave.numero){
            vetor[j + 1] = vetor[j];
            j--
        }
        vetor[j + 1] = chave;
        imprimirVetor(vetor);

    }
    // não estavel: seleção
    for(int i = 0; i < vetor.length - 1; i++){
        int indexMenor = i;

        for(int j = i + 1; j < vetor.length; j++){
            if(vetor[j].numero < vetor[indexMenor].numero){
                indexMenor = j;
            }
        }
        Item temp = vetor[indexMenor];
        vetor[indexMenor] = vetor[i];
        vetor[i] = temp;

        imprimirVetor(vetor);
    }
    
}

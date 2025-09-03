package lista;

public class Lista {

    int[] array;
    int n;
    Lista(){ this(6); }// cria lista 6 elementos
    Lista(int tamanho){
        array = new int[tamanho];
        n = 0;
    }
    void inserirInicio(int x) throws Exception{
        if(n >= array.length){// compara numero de elementos(n) com a capacidade maxima do array
            throw new Exception("Erro!");
        }
        // levar elementos para o fim do array
        for(int i = n; i > 0; i--){// todos os elementos que estao no array, precisam ser movidos uma posicao para a direita
            array[i] = array[i-1];
        }
        array[0] = x;// depois de movidos, o array inicial recebe o x
        n++;// acrescenta o array inserido no numero de elementos
    }
    void inserirFim(int x) throws Exception{
        if(n >= array.length){// verifica há espaço na lista
            throw new Exception("Erro");
        }
        array[n] = x;// caso haja, adiciona o X no final dela
        n++;// incrementa em 1 os numeros de elementos do array
    }
    void inserir(int x, int pos) throws Exception{
        if(n >= array.length || pos < 0 || pos > n){// verifica se esta cheio, se a posição é maior q 0 e se a posicao é menor que o numero de elementos
            throw new Exception("Erro");
        }
        for(int i = n; i > pos; i--){
            array[i] = array[i - 1];// o loop começa no final da lista e i = n e vai se movendo para trás ate chegar na posicao desejada i > pos, em cada passo ele copia troca os elementos
        }// analogia: é como furar fila, mas de forma organizada, ele copia o elemento da esquerda para a posicao atual array[i] = array[i - 1]
        array[pos] = x;// com o espaco livre na posicao pos, o novo valor X é colocado la
        n++;// atualiza o tamanho
    }
    int removerInicio() throws Exception{// remove o primeiro elemento e retorna o valor do elemento removido
        if(n == 0){// verifica se a lista está vazia
            throw new Exception("Erro");
        }
        int resp = array[0];// salva o elemento que vai ser removido
        n--;// atualiza o tamanho da lista
        for(int i = 0; i < n; i++){
            array[i] = array[i + 1];// move todos os elementos 1 posicao para a esquerda para "fechar" o buraco deixado pelo elemento que foi retirado no inicio
        }
        return resp;// devolve o elemento removido
    }
    int removerFim throw Exception(){// remove o ultimo elemento da lista e retorna o valor removido
        if(n == 0){// verifica se a lista esta vazia
            throw new Exception("Erro");
        }
        return array[-- n];// primeiro ele diminui o valor de n e DEPOIS usa ele e retorna o valor encontrado DEPOIS que a lista foi diminuida
    }
    int remover(int pos) throws Exception{
        if(n == 0 || pos < 0 || pos >= n){// verifica se a lista esta vazia, se a posicao esta fora dos limites
            throw new Exception("Erro");
        }
        int resp = array[pos];// salva a posicao que sera removido
        n--;// atualza o contador de elementos da lista/vetor
        for(int i = pos; i < n; i++){// quando foi removido, ficou um "buraco" na lista, o loop fecha o buraco movendo todos os elementos que estavam a direita do buraco para uma posicao a esquerda
            array[i] = array[i + 1];// o loop começa no local do buraco e vai ate o novo final da listaa(n), em cada passo ele copia o elemento da direita (array[i + 1] para a posicao atual array[i])
        }// analogia, em uma fila, se uma pessoa do meio sai dela, todas que estao atras dao 1 passo a frente
        return resp;// retorna o elemento removido
    }
    void mostrar(){
        System.out.print("[");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }// sairá assim: [1,2,3,4]

    
}

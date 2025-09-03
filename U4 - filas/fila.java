package U4 - filas;

public class fila {
    class fila{
        int[] array;// vai armazenar os numeros da fila
        int primeiro, ultimo;// funcionam como ponteiros/marcadores que nos dizem onde começa e termina a fila dentro do array
        // primeiro: guarda o indice do primeiro elemento da fila(quem esta na frente para ser removido)
        // ultimo: guarda o indice da posicao vazia onde o proximo elemento será inserido
        Fila(){
            this(5);// passa como 5 o tamanho padrao
        }
        Fila(int tamanho){// construtor que inicializa a fila
            array = new int[tamanho + 1];//cria o array com um tamanho de tamanho + 1, esse + 1 ajuda a diferenciar de forma simples uma fila cheia de uma fila vazia, evitando que os ponteiros primeiro e iultimo se confundam e parem na mesma posicao
            primeiro = ultimo = 0; // inicializa ambos na posicao 0, o primeiro elemento, logicamente, entrara na posicao 0
        }
        void inserir(int x) throws Exception{
            if(((ultimo + 1) % array.length) == primeiro){
                throw new Exception("Erro");
            }
            array[ultimo] = x;
            ultimo = (ultimo + 1) % array.length;
        }
        int remover(){}
        void mostrar(){}

    }
}

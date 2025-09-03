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
            if(((ultimo + 1) % array.length) == primeiro){// calcula qual seria a proxima posicao do ponteiro ultimo, se estiver no final do array, o resultado será 0, se for "primeiro", nao há espaço livre
                throw new Exception("Erro");
            }
            array[ultimo] = x;// o novo valor de x é colocado na posicao vazia para a qual o ponteiro ultimo esta apontando
            ultimo = (ultimo + 1) % array.length;// implementacao do movimento circular, o ponteiro ultimo avança para a proxima casa vazia
            // se ultimo não estiver no final, (ultimo + 1) será menor que array.length e o resultado do modulo será simplesmente ultimo + 1. Se ultimo estiver na ultima posicao (ultimo + 1) será igual a array.length, e o resultado será 0, fazendo o ponteiro dar a volta para o inicio do array
        }
        int remover()throws Exception{
            if(primeiro == ultimo){// verifica se a fila ta vazia
            // se o ponteiro primeiro estiver na mesma posicao que ultimo, significa que nao ha elementos entre eles, ou seja, a fila esta vazia
                throw new Exception("Erro");
            }
            int resp = array[primeiro];// guarda o valor que será retirado
            primeiro = (primeiro + 1) % array.length;//o ponteiro primeiro avança para a proxima posicao
            // o operador % garante que, se primeiro estiver na ultima posicao do array, ao ser incrementado ele dará a volta e passara a apontar para a posicao 0
            return resp;// retorna o valor retirado da fila
        }
        void mostrar(){
            int i = primeiro;//variavel temporaria que apontará para o primeiro elemento
            System.out.print("[");
            while (i != ultimo){//enquanto i não alcançar o ponteiro ultimo ele executa, lembrando que ultimo aponta para uma posicao vazia, entao quando i chega lá, significa que todos os elementos ja foram imprimidos
                System.out.print(array[i] + " ");
                i = (i + 1) % array.length;// move o i para a proxima posicao, usando a logica do modulo %, que garante que ele dê a volta para o indice 0 se chegar ao final do array
            }
            system.out.print("]");
            // TELA: [7,8,9,10,11]
        }

    }
}

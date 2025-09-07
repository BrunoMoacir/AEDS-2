package U4 - filas circulares;

public class anotações {

    // se usa um array de tamanho fixo, onde o inicio e o fim podem dar a volta, eliminando a necessidade da deslocação de elementos
    private int[] array;
    private int primeiro; // Aponta para o primeiro elemento da fila
    private int ultimo;   // Aponta para a próxima posição VAZIA

    /**
     * Construtor da classe. Cria uma fila com capacidade máxima.
     * @param max O número máximo de elementos que a fila poderá conter.
     */
    public FilaCircular(int max) {
        // DETALHE IMPORTANTE (O truque do +1):
        // Alocamos um espaço extra no array para simplificar a lógica de
        // diferenciar uma fila cheia de uma vazia.
        this.array = new int[max + 1];
        this.primeiro = 0;
        this.ultimo = 0;
    }

    public void enfileirar(int elem) throws Exception{
        if(((ultimo + 1) %array.length) == primeiro){// verifica se a fila ta cheia
            throw new Exception("Erro");
        }
        array[ultimo] = elem;
        // move o ponteiro ultimo de forma circular
        ultimo = (ultimo + 1) % array.length;
    }

    public int desenfileirar() throws Exception{
        if(primeiro == ultimo){// fila vazia
            throw new Exception("erro");
        }
        int removido = array[primeiro];
        // move o ponteiro 1 para frente de forma circular
        primeiro = (primeiro + 1) %array.length;
        return removido;
    }

    public void mostrar() throws Exception{
        if(primeiro == ultimo){// verifica se a fila esta vazia
            System.out.println("Erro"););
        }
        
    }
    
}

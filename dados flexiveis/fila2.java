class Celula{
    public int elemento;// dado que vou guardar
    public Celula prox;//ponteiro para a proxima celula

    public Celula(int x){
        this.elemento = x;
        this.prox = null;// o proximo começa como nulo
    }

    public Celula(){// construtor para no cabeça
        this.elemento = 0;
        this.prox = null;
    }
}

class Fila{
    private Celula primeiro;
    private Celula ultimo;

    public Fila(){
        primeiro = new Celula();// celula fantasma, no cabeça
        ultimo = primeiro;// no inicio a celula cabeca e a primeira e a ultima
    }

    public void inserir(int x){
        // cria o novo no e coloca no fim da fila
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;// atualiza o no ultimo, para apontar para o novo no
    }

    public int remover() throws Exception{
        if(primeiro == ultimo){
            throw new Exception("erro");
        }
        Celula tmp = primeiro.prox;// salva o que sera removido

        int elemento = tmp.elemento;// pega o valor para retornar

        primeiro.prox = tmp.prox;// faz o no cabeça pular o removido
        // liberacao de memoria
        tmp.prox = null;
        tmp = null;

        return elemento;
    }

    public void mostrar(){
        System.out.print("[");
        for(Celula i = primeiro.prox; i != null; i = i.prox){
            System.out.print(i.elemento + " ");
        }
        System.out.print("]");
    }
}
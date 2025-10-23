class Celula {
    public int elemento;
    public Celula prox;

    public Celula(int x) {
        this.elemento = x;
        this.prox = null;
    }

    public Celula() {
        this(0);
    }
}

class Lista {
    private Celula primeiro;
    private Celula ultimo;

    public Lista() {
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public void inserirInicio(int x){
        Celula tmp = new Celula(x);
        // o novo no aponta para o 1 elemento
        tmp.prox = primeiro.prox;
        // o no cabeça aponta para o novo nó
        primeiro.prox = tmp;

        // caso a lista esteja vazia
        if(primeiro == ultimo){
            ultimo = tmp;
        }
        tmp = null;
    }

    public void inserirFim(int x){
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;// atualiza o nó ultimo para apontar pro novo nó
    }

    public int removerInicio() throws Exception{
        if(primeiro == ultimo){
            throw new Exception("erro");
        }
        Celula tmp = primeiro.prox;
        int elemento = tmp.elemento;
        primeiro.prox = tmp.prox;

        if(tmp == ultimo){
            ultimo = primeiro;
        }
        tmp.prox = null;
        tmp = null;
        return elemento;
    }

}

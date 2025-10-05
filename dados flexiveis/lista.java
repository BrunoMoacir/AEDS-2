public class lista {
// as listas flexiveis simples també sao chamadas de listas simplesmente encadeadas, listas simplesmente ligadas, listas ligadas
    private Celula primeiro, ultimo;
    public Lista(){
        primeiro = new Celula();
        ultimo = primeiro;
    }
    public void inserirFim(int x){}// igual da fila
    public int removerInicio(){}// igual da fila
    public void mostrar(){}// igual da fila
    public void inserirInicio(int x){
        Celula tmp = new Celula(x);
        tmp.prox = primeiro.prox;
        if(primeiro == ultimo){
            ultimo = tmp;
        }
        tmp = null;
    }
    public int removerFim() throws Exception{
        if(primeiro == ultimo){
            throw new Exception("Erro");
        }
        Celula i;
        for(i = primeiro; i.prox != ultimo; i = i.prox);
        int elemento  = ultimo.elemento;
        ultimo = i;
        i = ultimo.prox = null;
        return elemento;
    }
}

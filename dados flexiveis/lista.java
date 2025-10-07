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

    // adicionar um contador de elementos
    public Lista(){
        primeiro = new Celula();
        ultimo = primeiro;
        int count = 0;
    }
    public void inserirFim(int x){
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
        count++;
    }
    public int remover()throws Exception(){
        if(primeiro == ultimo){
            throw new Exception("Erro");
        }
        Celula tmp = primeiro.prox;
        int elemento = tmp.elemento;
        primeiro.prox = tmp.prox;
        if(tmp == ultimo) ultimo = primeiro;
        qt --;
        return elemento;
    }
    public int tamanho(){
        return qt;
    }



}

// insercao ordenada
class Celula{
    int elemento;
    Celula prox;

    Celula(int x){
        elemento = x;
        prox = null;
    }
}
public class ListaSimplesEncadeadaOrdenada{
    private Celula primeiro, ultimo;

    public ListaSimplesEncadeadaOrdenada(){
        primeiro = new Celula(0);// nó cabeça
        ultimo = primeiro;
    }

    public void inserir(int x){
        Celula i = primeiro;
        while(i.prox != null && i.prox.elemento < x){
            i = i.prox;
        }
        Celula novo = new Celula(x);
        novo.prox = i.prox;
        i.prox = novo;

        if(novo.prox == null){
            ultimo = novo;
        }
    }
    public void mostrar(){
        for(Celula i = promeiro.prox; i != null; i = i.prox){
            System.out.print(i.elemento + " ");
        }
        System.out.println();
    }
}

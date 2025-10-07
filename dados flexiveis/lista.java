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

    public void inserir(int x){
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }
    
    public void mostrarMultiplos3(){
        for(Celula i = primeiro.prox; i != null; i = i.prox){
            if(i.elemento % 3 == 0){
                System.out.print(i.elemento + ", ");
            }
        }
        System.out.println();
    }

    public int penultimoElemento() throws Exception{
        if(primeiro.prox == null || primeiro.prox.prox == null){
            throw new Exception("Erro");// lista nao tem penultimo elemento
        }

        Celula i;
        for(i = primeiro.prox; i.prox.prox != null; i= i.prox);// percorre ate o no cuja i.prox.prox == null
            return i.elemento
    }

    public int contarPares(){
        return contarParesRec(primeiro.prox);
    }

    public int contarParesRec(){
        if(i == null)return 0;// base
        int atual = (i.elemento % 2 == 0) ? 1 : 0;
        return atual + contarParesRec(i.prox);
    }
}

// PARA TODAS AS ESTRUTURAS FLEXIVEIS -> PILHA,LISTA E FILA A CLASSE CELULA E IGUAL

class Celula{
    public int elemento;
    public Celula prox;

    public Celula(int x){
        this.elemento = x;
        this.prox = null;
    }

    public Celula(){
        this(0);
    }
}
class Pilha{// ultimo a entrar -> primeiro a sair
// so insere e remove no topo
    private Celula topo;
    
    public Pilha(){
        topo = null;
    }

    public void inserir(int x){
        Celula tmp = new Celula (x);// crio uma celula temporaria com o elemento a ser inserido
        tmp.prox = topo;// o prox do novo aponta para o antigo topo
        topo = tmp;// topo agora recebe a nova celula
        tmp = null;
    }

    public int remover() throws Exception{
        if(topo == null){
            throw new Exception("Erro");
        }
        int elemento = topo.elemento;
        topo = topo.prox;
        return elemento;
    }
    // EXEMPLO VISUAL
    // topo -> [30] -> [20] -> [10] -> null

}

class Fila{
    private Celula primeiro;
    private Celula ultimo;

    public Fila(){
        primeiro= new Celula();//sentinela
        ultimo = primeiro;
    }

    public void inserir(int x){
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;// atualiza o nó ultimo para apontar para o novo no
    }

    public int remover() throws Exception{
        if(primeiro == ultimo){
            throw new Exception("erro");
        }

        Celula tmp = primeiro.prox;
        int elemento = tmp.elemento;
        primeiro.prox = tmp.prox;
        if(ultimo == tmp){
            ultimo = primeiro;
        }
        tmp.prox = null;
        return elemento;
    }
}

class Lista{
    private Celula primeiro;
    private Celula ultimo;

    public Lista(){
        primeiro = new Celula();
        ultimo = primeiro;
    }

    public void inserirFim(int x){
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }

}
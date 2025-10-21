public class main {
    
}
class No{
    int elemento;
    No esq;
    No dir;

    No(int elemento){// contrutor basico
        this(elemento,null,null);// chama o contrutor completo
    }

    No(int elemento, No esq, No dir){
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}
class ArvoreBinaria{
    private No raiz;
    // raiz é o primeiro no da arvore (ponto de partida)
    // se for == null, a arvore esta vazia
    public ArvoreBinaria(){
        raiz = null;
    }

    public void inserir(int x) throws Exception{
        raiz = inserir(x,raiz);// chama o inserir recursivo, que começa pela raiz

    }

    private No inserir(int x, No i) throws Exception{
        if(i == null){// caso base: encontrei um lugar vazio
            i = new No(x);// criei o novo nó aqui
        }
        // passo recursivo: ir para a esquerda
        else if(x < i.elemento){
            // chamo a recursao para esquerda(i.esq)
            i.esq = inserir(x, i.esq);
        }
        else if( x > i.elemento){
            // caso o elemento seja maior, chamo a recursao para a direita
            i.dir = inserir(x , i.dir);
        }else{
            // elemento ja existe
            throw new Exception("Elemento ja existe");
        }
        return i;// retorna a referencia do no atual, modificado ou nao
    }

    public boolean pesquisar(int x){
        return pesquisar(x,raiz);
    }
    private boolean pesquisar(int x, No i){
        boolean resp;
        if(i == null){
            resp = false;// nao achou
        } else if(x == i.elemento){
            resp = true; // achou
        } else if( x < i.elemento){
            resp = pesquisar(x, i.esq);// ir para esquerda
        } else{
            resp = pesquisar(x, i.dir);// ir para direita
        }
        return resp;
    }
    // caminhar PRE -> raiz, esquerda -> direita, util para copiar uma arvore, pois salva a raiz primeiro
    void caminharPre(){
        caminharPre(raiz);
    }
    void caminharPre(No i){
        if(i != null){
            System.out.print(i.elemento + " ");
            caminharPre(i.esq);
            caminharPre(i.dir);
        }
    }
    // caminhar POS -> visita o no DEPOIS dos filhos -> esquerda-> direita-> Raiz
    void caminharPos(){
        caminharPos(raiz);
    }
    void caminharPos(No i){
        if(i != null){
            caminharPos(i.esq);
            caminharPos(i.dir);
            caminharPos(i.elemento + " ");
        }
    }
    //caminhar CENTRAL -> visita o no entre os filhos -> esquerda -> Raiz -> Direita
    void caminharCentral(){
        caminharCentral(raiz);
    }
    void caminharCentral(No i){
        if(i != null){
            caminharCentral(i.esq);
            caminharCentral(i.elemento + " ");
            caminharCentral(i.dir);
        }
    }
}

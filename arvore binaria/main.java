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
}

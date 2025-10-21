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
        raiz = inserir(int x, No i);// chama o inserir recursivo, que começa pela raiz

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
}

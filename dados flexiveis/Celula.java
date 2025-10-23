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
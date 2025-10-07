
class Fila {
    private Celula primeiro, ultimo;// primeiro: ponteiros para a primeira celula da fila / ultimo: ponteiro para a ultima celula da fila
    public Fila(){
        primeiro = new Celula();
        ultimo = primeiro;// ultimo aponta para primeiro porque a celula cabeca é a unica celula da fila p enquanto
    }
    public void inserir(int x){
        ultimo.prox = new Celula(x);// cria uma nova celula com o valor x e a conecta ao final da fila
        ultimo = ultimo.prox;// ultimo é a ultima celula atual, e .prox é a referencia para a proxima celula, que agora é a nova celula que acabamos de criar
    }
    public int remover() throws Exception{
        if(primeiro == ultimo){// verifica se a fila esta vazia
            throw new Exception("Erro");
        }
        Celula tmp = primeiro;// cria uma ref temporada para a celula cabeça
        primeiro = primeiro.prox;// move o ponteiro para o proximo elemento, e o novo elemento se torna o novo primeiro da fila
        int elemento = primeiro.elemento;//obtem o valor que será removido
        tmp.prox = null;// remove a referencia 
        tmp = null;// remove a ref 
        return elemento;// retorna o valor que foi removido
    }

    // retornar maior elemento

    public int maiorElemento() throws Exception{
        if(primeiro == null){
            throw new Exception("Erro");
        }
        int maior = primeiro.elemento;
        for(Celula i = primeiro.prox; i != null; i = i.prox){
            if(maior < i.elemento){
                maior = i.elemento;
            }
        }
        return maior;
    }


    // retornar terceiro elemento
    public int terceiroElemento() throws Exception{
        if(primeiro == null || primeiro.prox == null || primeiro.prox.prox == null){
            throw new Exception("Erro");
        }
        return primeiro.prox.prox.elemento;
    }

    // somar todos os elementos

    


    
}
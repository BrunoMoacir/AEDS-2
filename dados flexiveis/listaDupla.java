public class listaDupla {
    class CelulaDupla{
        public int elemento;
        public CelulaDupla prox,ant;
        public CelulaDupla (){
            this(0);
        }
        public CelulaDupla(int x){
            this.elemento = x;
            this.prox = this.ant = null;
        }
    }
    class ListaDupla{
        private CelulaDupla primeiro, ultimo;
        public ListaDupla(){
            primeiro = new CelulaDupla();
            ultimo = primeiro;
        }
    }

    public void inserirInicio(int x){
        CelulaDupla tmp = new CelulaDupla(x);
        tmp.ant = primeiro;
        tmp.prox = primeiro.prox;
        primeiro.prox = tmp;
        if(primeiro == ultimo){
            ultimo = tmp;
        } else{
            tmp.prox.ant = tmp;
        }
        tmp = null;
    }

    public void inserirFim(int x){
        ultimo.prox = new CelulaDupla(x);
        ultimo.prox.ant = ultimo;
        ultimo = ultimo.prox;
    }

    public int removerInicio() throws Exception{
        if(primeiro == ultimo){
            throw new Exception ("Erro");
        }
        CelulaDupla tmp = primeiro;
        primeiro = primeiro.prox;
        int elemento = primeiro.elemento;
        tmp.prox = primeiro.ant = null;
        tmp = null;
        return elemento;
    }
    // supondo uma lista com os elementos 3,5 e 7, execute o remover no inicio
    public int removerInicio() throws Exception{
        if(primeiro == ultimo){
            throw new Exception("Erro");
        }
        Celula tmp = primeiro.prox;
        int elemento = tmp.elemento;
        primeiro.prox = tmp.prox;// liga ao proximo no
        tmp.prox.ant = primeiro;//liga diretamente ao proximo nó
        tmp.prox = null;
        tmp.ant - null;
        tmp = null;
        return elemento;

    }

    public int removerFim() throws Exception{
        if(primeiro == ultimo){
            throw new Exception("Erro");
        }
        int elemento = ultimo.elemento;
        ultimo = ultimo.ant;
        ultimo.prox.ant = null;
        ultimo.prox = null;
        return elemento;
    }
    // supondo uma lista com os elementos 3,5 e 7, execute o remover no fim

    public void inserir(int x, int pos) throws Exception{
        int tamanho = tamanho();
        if(pos < 0 || pos > tamanho){
            throw new Exception("erro");
        }
        else if(pos == 0){
            inserirInicio(x);
        } else if(pos == tamanho){
            inserirFim(x);
        } else{
            CelulaDupla i = primeiro;
            for(int j = 0; j < pos; j ++, i = i.prox);
            CelulaDupla tmp = new CelulaDupla(x);
            tmp.ant = i;
            tmp.prox = i.prox;
            tmp.ant.prox = tmp.prox.ant = tmp;
            tmp = i = null;
        }
    }
    
    // inverter a ordem dos elementos da lista dupla
    void inverte(){
        Celula i = primeiro.prox;
        Celula j = ultimo;
        while( i != j && j.prox != i){
            int tmp = i.elemento;
            j.elemento = tmp;
            i = i.prox;
            j = j.ant;
        }
    }

    // inverter a ordem dos elementos da lista simples
    void inverte(){
        Celula i = primeiro.prox;
        Celula j = ultimo;
        Celula k;
        while( i != j && j.prox != i){
            int tmp = i.elemento;
            i.elemento = j.elemento;
            j.elemento = tmp;
            i = i.prox;
            for(k = primeiro; k.prox != j; k = k.prox);
                j = k;
        }
    }

    // implementar o Shellsort na lista dupla
    // estrategia:
    // calcular o tamanho da lista
    // comecar com um gap = tamanho / 2
    // para cada gap: 1. percorrer a lista da esquerda para direita
    //2. para cada nó, deslocar o valor para a posicao correta
    // repetir diminuindo o gap ate 1
    public void shellsort() throws Exception{
        int n = tamanho();
        if(n < 2){
            throw new Exception("erro");
        }
        for(int gap = n / 2; gap > 0; gap /= 2){
            for(int i = gap; i < n; i++){
                CelulaDupla noAtual = getNode(i);
                int valorAtual = noAtual.elemento;
                int j = i;
                // move os elementos do sub array que sao maiores que o valor atual para uma posicao a frente de sua posicao atual
                while(j >= gap && getNode(j - gap).elemento > valorAtual){
                    // pega os nos que precisam trocar de valor
                    CelulaDupla noParaMover = getNode(j);
                    CelulaDupla noAnteriorNoGap = getNode(j - gap);

                    // troca os valores
                    swap(noParaMover, noAnteriorNoGap);
                    j -= gap;
                }
            }
        }
    }
    

}

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
    
}

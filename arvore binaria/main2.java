class No{
    int elemento;
    No esq;
    No dir;

    No(int elemento){
        this(elemento, null,null);
    }

    No(int elemento, No esq, No dir){
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}

class ArvoreBinaria{
    private No raiz;

    public ArvoreBinaria(){
        raiz = null;
    }
    // procura a posicao correta e cria o no la
    public void inserir(int x) throws Exception{
        raiz = inserir(x, raiz);
    }

    private No inserir(int x, No i) throws Exception{
        if(i == null){// achou lugar vazio
            i = new No(x);
        } else if(x < i.elemento){
            i.esq = inserir(x, i.esq);
        } else if(x > i.elemento){
            i.esq = inserir(x, i.dir);
        } else {
            throw new Exception("erro");
        }
        return i;
    }

    public boolean pesquisar(int x){
        return pesquisar(x,raiz);
    }
    // mesma logica de inserir, se for = null nao existe, = 
    public boolean pesquisar(int x, No i){
        boolean existe;
        if(i == null){
            existe = false;
        } else if(x == i.elemento){
            existe = true;
        } else if(x < i.elemento){
            return pesquisar(x,i.esq);
        } else{
            return pesquisar(x, i.dir);
        }
        return existe;
    }
}
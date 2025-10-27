class No {
    int elemento;// valor armazenado no no
    No esq;// ref para o filho da esquerda
    No dir;// ref para o filho da direita

    No(int elemento) {
        this(elemento, null, null);// elemento da raiz
    }

    No(int elemento, No esq, No dir) {// elementos "comuns"
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}

class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {// inicia uma arvore vaziaz
        raiz = null;
    }

    // procura a posicao correta e cria o no la
    public void inserir(int x) throws Exception {
        raiz = inserir(x, raiz);
    }

    private No inserir(int x, No i) throws Exception {
        if (i == null) {// achou lugar vazio
            i = new No(x);
        } else if (x < i.elemento) {
            i.esq = inserir(x, i.esq);
        } else if (x > i.elemento) {
            i.esq = inserir(x, i.dir);
        } else {
            throw new Exception("erro");
        }
        return i;
    }

    public boolean pesquisar(int x) {
        return pesquisar(x, raiz);
    }

    // mesma logica de inserir, se for = null nao existe, =
    public boolean pesquisar(int x, No i) {
        boolean existe;
        if (i == null) {
            existe = false;
        } else if (x == i.elemento) {
            existe = true;
        } else if (x < i.elemento) {
            return pesquisar(x, i.esq);
        } else {
            return pesquisar(x, i.dir);
        }
        return existe;
    }

    // ordem dos caminhamentos:
    // pré ordem : raiz -> esquerda -> direita --> copiar arvore
    // central: esquerda -> raiz -> direita --> exibe ordenado
    // pos ordem: esquerda-> direita -> raiz --> mais usado para deleta arvore

    public void caminharPre() {
        System.out.print("[");
        caminharPre(raiz);
        System.out.print("]");
    }

    private void caminharPre(No i) {
        if (i != null) {
            System.out.print(i.elemento + " ");
            caminharPre(i.esq);
            caminharPre(i.dir);
        }
    }

    public void caminharCentral() {
        System.out.print("[");
        caminharCentral(raiz);
        System.err.print("]");
    }

    private void caminharCentral(No i) {
        if (i != null) {
            caminharCentral(i.esq);
            System.out.print(i.elemento + " ");
            caminharCentral(i.dir);
        }
    }

    public void caminharPos() {
        System.out.print("[");
        caminharPos(raiz);
        System.out.print("]");
    }

    private void caminharPos(No i) {
        if (i != null) {
            caminharPos(i.esq);
            caminharPos(i.dir);
            System.out.print(i.elemento + " ");
        }
    }
}
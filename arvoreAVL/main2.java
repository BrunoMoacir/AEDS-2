class No {
    int elemento;// valor armazenado no no
    No esq;// ref para o filho da esquerda
    No dir;// ref para o filho da direita
    int nivel;

    No(int elemento) {
        this(elemento, null, null);// elemento da raiz
    }

    No(int elemento, No esq, No dir) {// elementos "comuns"
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
        this.nivel = 1;// altura do nó
    }

    void setNivel(){
        // se o filho for nulo, nivel 0
        int nivelEsq = (esq == null) ? 0 : esq.nivel;
        int nivelDir = (dir == null) ? 0 : dir.nivel;
        this.nivel = Math.max(nivelEsq, nivelDir) + 1;
    }

    int getFatorBalanceamento(){// pegar  o fator de balanceamento
        int nivelEsq = (esq == null) ? 0 : esq.nivel;
        int nivelDir = (dir == null) ? 0 : dir.nivel;
        return nivelDir - nivelEsq;
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

        i.setNivel();

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
            System.out.print(i.elemento + "(" + i.nivel + ") ");
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

    public int contarNos(){
        return contarNos(raiz);
    }

    private int contarNos(No i){
        if(i == null){
            return 0;
        } else{
            return 1 + contarNos(i.esq) + contarNos(i.dir);// esse +1 -> "conte esse nó, mais todos os nos a esquerda, mais todos os nos a direita"
        }
    }

    public int somarElementos(){
        return somarElementos(raiz);
    }

    private int somarElementos(No i){
        if(i == null){
            return 0;
        } else{
            return i.elemento + somarElementos(i.esq) + somarElementos(i.dir);
        }
    }

    public int contarFolhas(){
        return contarFolhas(raiz);
    }

    private int contarFolhas(No i){
        if(i == null){
            return 0;
        } else if(i.esq == null && i.dir == null){
            return 1;
        } else {
            return contarFolhas(i.esq) + contarFolhas(i.dir);
        }
    }

    public int contarPares(){
        return contarPares(raiz);
    }

    private int contarPares(No i){
        int resultado = 0;
        if(i != null){
            if(i.elemento % 2 == 0){
                resultado = 1;
            }
            resultado += contarPares(i.esq) + contarPares(i.dir);// nem todo o no deve ser contado, apenas alguns especificos
        }
        return resultado;
    }

}
public class main2 { // Você pode renomear para Main ou LabArvoreBinaria
    public static void main(String[] args) {
        try {
            ArvoreBinaria arvore = new ArvoreBinaria();

            // Vamos inserir alguns números
            arvore.inserir(10);
            arvore.inserir(5);
            arvore.inserir(15);
            arvore.inserir(3);
            arvore.inserir(7);
            arvore.inserir(12);
            arvore.inserir(18);

            /* A árvore ficará assim:
             * 10
             * /    \
             * 5      15
             * / \    /  \
             * 3   7  12  18
             */

            System.out.println("--- Caminhamentos ---");
            arvore.caminharCentral(); // Deve imprimir em ordem: [ 3 5 7 10 12 15 18 ]
            arvore.caminharPre();     // Deve imprimir: [ 10 5 3 7 15 12 18 ]
            arvore.caminharPos();     // Deve imprimir: [ 3 7 5 12 18 15 10 ]

            System.out.println("\n--- Pesquisas ---");
            System.out.println("Pesquisar 7: " + (arvore.pesquisar(7) ? "Achou" : "Nao Achou"));
            System.out.println("Pesquisar 99: " + (arvore.pesquisar(99) ? "Achou" : "Nao Achou"));

            // Testando a exceção
            // arvore.inserir(7); // Descomente esta linha para ver a exceção

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
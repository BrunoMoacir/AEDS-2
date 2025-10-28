import java.util.Scanner;

class No {
    int elemento;
    No esq;
    No dir;

    No(int elemento) {
        this(elemento, null, null);
    }

    No(int elemento, No esq, No dir) {
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}

class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void inserir(int x) throws Exception {
        raiz = inserir(x, raiz);
    }

    public No inserir(int x, No i) throws Exception {
        if (i == null) {
            i = new No(x);// encontrei o lugar
        } else if (x < i.elemento) {
            i.esq = inserir(x, i.esq);
        } else if (x > i.elemento) {
            i.dir = inserir(x, i.dir);
        } else {
            throw new Exception("erro");
        }
        return i;
    }

    public boolean pesquisar(int x) {
        return pesquisar(x, raiz);
    }

    private boolean pesquisar(int x, No i) {
        boolean resp = false;
        if (i != null) {
            System.out.print(i.elemento + " ");// imprime o no visitado !
            if (x == i.elemento) {
                resp = true;
            } else if (x < i.elemento) {
                resp = pesquisar(x, i.esq);
            } else {
                resp = pesquisar(x, i.dir);
            }
        }
        return resp;
    }

    public void caminharPre() {
        if (raiz == null) {
            System.out.println("v");
        } else {
            caminharPre(raiz);
            System.out.println();
        }
    }

    private void caminharPre(No i) {
        if (i != null) {
            System.out.print(i.elemento + " ");
            caminharPre(i.esq);
            caminharPre(i.dir);
        }
    }

    public void caminharOrdem() {
        if (raiz == null) {
            System.out.println("v");
        } else {
            caminharOrdem(raiz);
            System.out.println();
        }
    }

    private void caminharOrdem(No i) {
        if (i != null) {
            caminharOrdem(i.esq);
            System.out.print(i.elemento + " ");
            caminharOrdem(i.dir);
        }
    }

    public void caminharPos() {
        if (raiz == null) {
            System.out.println("v");
        } else {
            caminharPos(raiz);
            System.out.println();
        }
    }

    private void caminharPos(No i) {
        if (i != null) {
            caminharPos(i.esq);
            caminharPos(i.dir);
            System.out.print(i.elemento + " ");
        }
    }
}

public class LabArvoreBinaria {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArvoreBinaria arv = new ArvoreBinaria();

        while (sc.hasNext()) {
            String comando = sc.next();

            if (comando.equals("I")) {
                int x = sc.nextInt();
                arv.inserir(x);
            } else if (comando.equals("P")) {
                int x = sc.nextInt();
                boolean achou = arv.pesquisar(x);
                if (achou) {
                    System.out.println("S");
                } else {
                    System.out.println("N");
                }
            } else if (comando.equals("PRE")) {
                arv.caminharPre();
            } else if (comando.equals("POS")) {
                arv.caminharPos();
            } else if (comando.equals("EM")) {
                arv.caminharOrdem();
            }
        }
        sc.close();
    }
}
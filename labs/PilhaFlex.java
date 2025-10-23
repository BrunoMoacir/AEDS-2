import java.util.Scanner;

class Celula {
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

class Pilha{
    private Celula topo;

    public Pilha(){
        topo = new Celula();// celula cabeça
    }

    public void inserir(int x){
        Celula tmp = new Celula(x);
        tmp.prox = topo.prox;
        topo.prox = tmp;
    }

    public int remover(){
        if(topo.prox == null){
            System.out.println(-1);
            return -1;
        } else{
            Celula tmp = topo.prox;
            int elemento = tmp.elemento;
            topo.prox = tmp.prox;
            tmp.prox = null;
            System.out.println(elemento);
            return elemento;
        }
    }
    
    public void mostrar(){
        if(topo.prox == null){
            System.out.println("V");
        } else{
            for(Celula i = topo.prox; i != null; i = i.prox){
                System.out.print(i.elemento + " ");
            }
            System.out.println();
        }
    }

    public boolean pesquisa(int x){
        boolean existe = false;
        for(Celula i = topo.prox; i != null; i = i.prox){
            if(i.elemento == x){
                existe = true;
            }
        }
        return existe;
    }
}

public class PilhaFlex{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();

        while(sc.hasNext()){
            char comando = sc.next().charAt(0);

            switch(comando){
                case 'E':// desempilhar
                    int num = sc.nextInt();
                    pilha.inserir(num);
                    break;

                case 'D': // desempilhar 
                    pilha.remover();
                    break;
                case 'M':
                    pilha.mostrar();
                    break;
                case 'P':
                    int valor = sc.nextInt();
                    if(pilha.pesquisa(valor))
                        System.out.println("S");
                    else
                        System.out.println("N");
                    break;
            }
        }
        sc.close();
    }
}
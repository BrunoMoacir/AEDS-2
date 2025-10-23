class Celula{
    public int elemento;
    public Celula prox;

    public Celula(int x){
        this.elemento = x;
        this.prox = null;
    }
}
class Pilha2{
    private Celula topo;
    
    public Pilha2(){
        topo = null;
    }

    public void inserir(int x){
        Celula tmp = new Celula(x);// cria novo no
        tmp.prox = topo;// o prox do novo no aponta para o antigo topo
        topo = tmp;// o topo agora recebe o novo
        tmp = null;// libera o ponteiro temporario
    }

    public int remover() throws Exception{
        if(topo == null){
            throw new Exception("erro");
        }
        int elemento = topo.elemento;// pego o elemento a ser removido
        Celula tmp = topo;//coloco o topo antigo em uma celula tmp
        topo = topo.prox;// o topo antigo recebe o novo topo
        tmp.prox = null;// libero memoria
        tmp = null;// libero memoria

        return elemento;
    }

    public void mostrar(){
        System.out.print("[");
        for(Celula i = topo; i != null; i = i.prox){
            System.out.print(i.elemento + " ");
        }
        System.out.println("]");
    }
}
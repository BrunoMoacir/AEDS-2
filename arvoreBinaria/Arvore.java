class No{
    public int elemento;
    public No esq, dir;
    int cont;
}
public class Arvore{
    private No raiz;

    void inserir(int x){
        raiz = inserir(x, raiz);
    }
    
    public void inserir(int x){
        if(i == null){
            i = new No(x);
        } else if(x < i.elemento){
            i.esq = inserir(x, i.esq);
        }else if(x > i.elemento){
            i.dir = inserir(x, i.dir);
        } else{
            i.cont ++;// elemento repetido -> incrementa contador
        }
        return i;

    }
}
// melhor caso: O(log n)
// pior caso: O(n)
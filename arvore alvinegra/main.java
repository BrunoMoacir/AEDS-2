class NoAN{
    public boolean cor;
    public int elemento;
    public NoAN esq, dir;
    public NoAN(){
        this(-1);
    }
    public NoAN(int elemento){
        this(elemento,false,null,null);
    }
    public NoAN(int elemento, boolean cor){
        this(elemento,cor,null,null);
    }
    public NoAN(int elemento, boolean cor, NoAN esq, NoAN dir){
        this.elemento = elemento;
        this.cor = cor;
        this.esq = esq;
        this.dir = dir;
    }
    // todo no é vermelho ou preto
    // a raiz sempre é preta
    // nos vermelhos nao podem ter filhos vermelhos
    // todo caminho da raiz ate uma folha nula tem a msm qt de nos pretos
    // insercoes podem gerar casos de recoloração    
}
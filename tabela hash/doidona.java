class DoidonaSemTADsProntas {
    final int TAMT1 = 100;
    final int TAMT3 = 100;
    final int NULO = -0x7FFFFF;

    int[] t1;
    int[] t3;

    Celula primeiroListaT2, ultimoListaT2;
    No raizArvoreT2, raizArvoreT3;

   public Doidona (){
      t1 = new int[TAMT1];
      t3 = new int[TAMT3];

      for(int i = 0; i < TAMT1; i++){
         t1[i] = NULO;
      }
      for(int i = 0; i < TAMT3; i++){
         t3[i] = NULO;
      }

      primeiroListaT2 = ultimoListaT2 = new Celula();

      raizArvoreT2 = raizArvoreT3 = null;
   }

    public int hashT1(int elemento) {
    }

    public int hashT2(int elemento) {
    }

    public int hashT3(int elemento) {
    }

    public int rehashT3(int elemento) {
    }

    public void inserir(int elemento) {
        int i = hashT1(elemento);

        if (elemento == NULO) {
            System.out.println("ERRO: elemento invalido");
        } else if (t1[i] == NULO) {
            t1[i] = elemento;
        } else if (hashT2(elemento) == 1) {
            inserirLista(elemento);
        } else if(hashT2(elemento) == 2){
            raizArvoreT2 = inserirArvore(raizArvoreT2, elemento);
        } else {
            inserirArvoreRB(elemento);
        }
    }

    public boolean pesquisar(int elemento) {
        boolean resp;
        int i = hashT1(elemento);
        if(t1[i] == NULO){
            resp = false;
        } else if(t1[i] == elemento){
            resp = true;
        } else if(hashT2(elemento) == 0){
            resp = pesquisarLista(elemento);
        } else if(hashT2(elemento) == 1){
            resp = pesquisarArvore(raizArvoreT2, elemento);
        } else{
            resp = false;
            System.out.println("Erro");
        }
    }
}
public class exercicio1 {
    // inicializa com um array para guardar os inteiros e um contador de elementos
    public int[] array;
    public int n;
    // construtor
    public listaLinear(int max){
        this.array = new int[max];
        this.n = 0;
    }
    // inserções -> inicio, fim, inserir
    public void inserirInicio(int elem) throws Exception{
    //1. verificar se a lista esta cheia
    // empurrar os elementos para a direita
    // colocar no novo na posicao 0
    // incrementar o n
        if(n >= array.length){
            throw new Exception("Erro");
        }
        // deslocar elementos para a direta
        for(int i = n; i > 0; i--){
            array[i] = array[i -1];
        }
        // insere o novo elemento
        array[0] = elem;
        n++;
    }
    public void inserirFim(int elem) throws Exception{
        if(n >= array.length){
            throw new Exception("Erro");
        }
        array[n] = elem;
        n++;
    }
    public void inserir(int elem, int pos) throws Exception{
        if(n >= array.length || pos < 0 || pos > n){
            throw new Exception("Erro");
        }
        // empurro os elementos da posicao pos em diante para a direita
        for(int i = n; i>pos; i--){
            array[i] = array[i - 1];
        }
        // coloco o elemento na posicao desejada
        array[pos] = elem;
        n++;
    }
    // remoções-> remover inicio, remover fim, remover
    public void removeInicio() throws Exception{
        // verificar se a lista esta vazia
        // salvar o valor do elemento retirado
        // decrementar n
        //puxar os elementos para fechar o buraco
        if(n == 0){
            throw new Exception("Erro");
        }
        int retirado = array[0];
        for(int i = 0; i < n; i++){
            array[i] = array[i + 1];
        }
        return retirado;
    }
    public int removeFinal()throws Exception{
        // verificar se a lista esta vazia
        // decrementar N
        if(n == 0){
            throw new Exception("Erro");
        }
        int retirado = array[n];
        n--;
        return retirado;
    }
    public int remove(int pos)throws Exception{
        if(n == 0 || pos < 0 || pos >= n){
            throw new Exception("Erro");
        }
        int retirado = array[pos];
        n--;
        for(int i = pos; i < n; i++){
            array[i] = array[i + 1];
        }
        return retirado;
    }
    // metodos auxiliares-> mostrar,pesquisar
    public void mostrar(){
        // percorrer o array de 0 ate n-1 e imprimir cada elemento
        System.out.print("[");
        for(int i = 0; i < n-1; i ++){
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
    public boolean pesquisar(int elem){
        // percorrer a lista de 0 ate n-1 e retornar true caso o elemento esteja nela
        boolean encontrado = false;
        for(int i = 0; i < n-1;i++){
            if(array[i] == elem){
                encontrado = true;
            }
        }
        return encontrado;
    }
}

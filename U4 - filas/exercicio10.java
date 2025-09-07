public class exercicio10 {
    
    public int[] array;
    public int n;// contador de elementos

    public void enfileirar(int elem) throws Exception{
        if(n >= array.length){
            throw new Exception("Erro");
        }
        array[n] = elem;
        n++;
    }

    public int desenfileirar() throws Exception{
        if(n == 0){
            throw new Exception("Erro");
        }
        int removido = array[0];
        n--;
        // depois de remover, deslocar os elementos para esquerda
        for(int i = 0; i < n; i++){
            array[i] = array[i - 1];
        }
        return removido;
    }

    public void mostrar() throws Exception{
        if( n == 0){
            throw new Exception("Erro");
        }
        System.out.print("[");
        for(int i = 0; i < n; i++){
            System.out.println(array[i] + " ");
        }
        System.out.print("]");
    }

    public boolean pesquisar(int elem){
        boolean existe = false;
        for(int i = 0; i < n; i++){
            if(array[i] == elem){
                existe = true;
            }
        }
        return existe;
    }

}

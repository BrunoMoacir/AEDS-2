public class exercicio6 {
    public int[] array;
    public int topo;

    public pilhaLinear(int max){
        this.array = new int[max];
        this.topo = 0;
    }

    public void push(int elem)throws Exception{
        if(topo >= array.length){
            throw new Exception("Erro");
        }
        array[topo] = elem;
        topo++;
    }

    public int pop() throws Exception{
        if( topo == 0){
            throw new Exception("Erro");
        }
        topo --;
        int retirado = array[topo];
        return retirado;
    }

    public void mostrar() throws Exception{
        if(topo == 0){
            throw new Exception("Erro, pilha vazia");
        }
        System.out.print("[");
        // loop começa no topo (topo -1) e vai ate o da base 0
        for(int i = topo -1; i >=0 ; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public boolean pesquisar(int elem){
        boolean existe = false;
        for(int i = 0; i < topo; i++){
            if(array[i] == elem){
                existe = true;
                i = topo;
            }
        }
        return existe;
    }
}

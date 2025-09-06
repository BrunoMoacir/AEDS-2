package U4 - listas;

public class exercicio4 {
    public int array[];
    public int n;

    public void inverteString()throws Exception{
        if( n == 0){
            throw new Exception("Erro");
        }
        // i começa no inicio e j no final
        // o loop continua enquanto i nao cruzar j
        for(int i = 0, j = n - 1; i < j; i++,j-- ){
            // logica de tropa(swap) usando var temporatia
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    public void inverteRecursivo() throws Exception{
        if( n == 0){
            throw new Exception("Erro");
        }
        inverteRec(0, n-1);
    }
    public void inverteRec(int i, int j){
        if(i < j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            inverteRec(i + 1, j - 1);
        }
    }
}

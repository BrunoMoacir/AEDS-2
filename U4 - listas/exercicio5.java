package U4 - listas;

public class exercicio5 {

    // insersao ordenada
    // olhar se a lista esta cheia
    //encontrar onde o novo elemento se encaixa, comparando com ou outros
    // deslocar todos os elementos a partir da posicao onde se encaixa
    // inserir ele la

    public void inserir(int elem) throws Exception{
        if(n >= array.length){
            throw new Exception("Erro");
        }
        // encontrar a posicao da inserção
        int i = 0;
        while(i < n && array[i] < elem){
            i++;
        }
        // deslocar os elementos maiores para direita
        for(int j = n; j > i; j--){
            array[j] = array[j - 1];
        }
        // inserir + incrementar o tamanho
        array[i] = elem;
        n++;
    }
    
    public int removeInicio(int elem)throws Exception{
        if(n = 0){
            throw new Exception("erro");
        }
        int removido = array[0];
        n--;
        for(int i = 0; i < n; i ++){
            array[i] = array[i + 1];
        }
        return removido;
    }

    public int removeFinal(int elem)throws Exception{
        if(n == 0){
            throw new Exception("Erro");
        }
        int removido = array[n - 1];
        n--;
        return removido;
    }
    
    public int remove(int pos)throws Exception{
        if(n == 0 || pos < 0 || pos > n){
            throw new Exception("Erro");
        }
        int removido = array[pos];
        n--;
        for(int i = pos; i < n; i++){
            array[i] = array[i + 1];
        }
        return removido;
    }

    public void mostrar() throws Exception{
        if(n == 0){
            throw new Exception("Erro");
        }
        System.out.print("[");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
    
    public boolean isOrdenada() throws Exception{
        boolean ordenada = true;
        if( n == 0){
            throw new Exception("Erro");
        }
        for(int i = 0; i < n; i++){
            if(array[i] > array[i + 1]){
                ordenada = false;
            }
        }
        return ordenada;
    }

    public boolean pesquisa(int elem){
        boolean resp = false;
        int esq = 0, dir = n, meio;
        while(esq <= dir){
            meio = (esq + dir) / 2;
            if(elem == array[meio]){
                resp = true;
                esq = dir + 1;
            } else if(elem > array[meio]){
                esq = meio + 1;
            } else{
                dir = meio - 1;
            }
        }
        return resp;
    }
}

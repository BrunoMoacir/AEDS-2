package U4 - listas;

public class exercicio3 {
    // inserirInicio chama o metodo inserir passando a posicao 0 como parametro
    public void inserir(int elem, int pos)throws Exception{
        if(n >= array.length || pos >=n || pos < 0){
            throw new Exception("Erro");
        }
        for(int i = n; i > pos;i--){
            array[i] = array[i - 1];// vou ate a posicao que quero para deixar livre
        }
        array[pos] = elem;// coloco o elemento lá
        n++;
    }
}

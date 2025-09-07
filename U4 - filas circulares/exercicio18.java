package U4 - filas circulares;

public class exercicio18 {
    public int[] array;
    public int primeiro;
    public int ultimo;
    public n;// contador de elementos

    public FilaCircular(int max){
        this.array = new int[max];
        this.primeiro = 0;
        this.ultimo = 0;
        this.n = 0;
    }

    public void enfileirar(int elem) throws Exception{
        if(n >= array.length){// verificar fila cheia a partir do contador
            throw new Exception("Erro");
        }
        array[ultimo] = elem;
        ultimo = (ultimo + 1) %array.length;
        n++;
    }

    public int desenfileirar() throws Exception{
        if(n == 0){
            throw new Exception("Erro");
        }
        int retirado = array[primeiro];
        primeiro = (primeiro + 1) %array.length;// não é preciso deslocar todos os elementos
        n--;
        return primeiro;
    }

    public void mostrar() throws Exception{
        if(n == 0){
            throw new Exception("Erro");
        }
        int i = primeiro;
        System.out.print("[");
        for(int count = 0; count < n; count++){
            System.out.print(array[i] + " ");
            i = (i + 1) % array.length;
        }
        System.out.print("]");
    }

    public boolean pesquisar(int elem) throws Exception{
        boolean existe = false;
        if(n == 0){
            throw new Exception("Erro");
        }
        int i = primeiro;
        for(int count = 0; count < n; count++){
            if(array[i] == elem){
                existe = true;
            }
            i = (i + 1) % array.length;
        }
        return existe;
    }
}

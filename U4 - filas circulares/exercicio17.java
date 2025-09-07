package U4 - filas circulares;

public class exercicio17 {
    // a primeira funcao chama a de baixo, e a de baixo chama ela mesma
    public void mostraElementos(){
        System.out.print("[");
        // inicia a recursao a partir da posicao primeiro
        mostraElementosRec(primeiro);
        System.out.print("]");
    }

    public void mostraElementosRec(int i){
        if(i != ultimo){// caso base, o i alcança o ultimo
            System.out.print(array[i] + " ");// imprime o elemento da posicao atual
            mostraElementosRec((i + 1) % array.length);// chama a proxima posicao calculando de forma circular
        }
    }
}

package U4

import java.lang.reflect.Array;

- filas circulares;

public class exercicio16 {

    public boolean isVazia(){
        boolean vazia = false;
        if(primeiro == ultimo){
            vazia = true;
        }
        return vazia;
    }

    public boolean isCheia(){
        boolean cheia = false;
        if((ultimo + 1) % array.length) == primeiro){
            cheia = true;
        }
        return cheia;
    }
    
}

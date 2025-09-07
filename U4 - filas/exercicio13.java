public class exercicio13 {

    // na filaLinear, o primeiro a entrar é o primeiro a sair
    public void mostraElementos(int i){
        if( i < n){
            System.out.println(array[i] + " ");
            mostraElementos(i + 1);
        }
        
    }
    public void mostraElementosRec(){
        System.out.println("[");
        mostraElementos(0);
        System.out.println("]");
    }
    
}

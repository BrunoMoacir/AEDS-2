public class exercicio9 {
    
    public void mostrarOrdem(){
        System.out.print("[");
        mostrarRecInsercao(0);
        System.out.print("]");
    }

    public void mostrarRecInsercao(int i ){
        if(i < this.topo){
            System.out.print(array[i] + " ");
            mostrarRecInsercao(i + 1);
        }
    }

}

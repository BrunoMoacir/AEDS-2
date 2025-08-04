public boolean verificaX(int{} inteiro, int x){
    boolean contido = false;
    for(int i = 0; i < inteiros.length; i++){
        if(inteiro[i] == x){
            contido = true;
        }
    }
    return contido;
}
// iterativa
bool pesquisaSequencial(int[] vetor, int x){
    bool resp = false;
    for(int i = 0; i < n; i++){
        if(vetor[i] == x){
            resp = true;
            i = n;// interrupção
        }
    }
    return resp;
}
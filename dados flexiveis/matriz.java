// matriz flexivel
// cada celula em uma matriz flexivel contem:
// o elemento (dado que ela armazena)
// quatro ponteiros:
// prox ou dir -> celula à direita
// ant ou esq -> celula à esquerda
// sup -> celula superior
// inf -> celula inferior

public void imprimir(){
    Celula i = inicio;
    for(int ii = 0; ii < linha; ii++){
        j = i;
        for(int jj = 0; jj < coluna; jj ++){
            System.out.println(j.elemento);
            j = j.dir;
        }
        i = i.inf;
    }
}
// matriz flexivel
// cada celula em uma matriz flexivel contem:
// o elemento (dado que ela armazena)
// quatro ponteiros:
// prox ou dir -> celula à direita
// ant ou esq -> celula à esquerda
// sup -> celula superior
// inf -> celula inferior

// imprimir
for(Celula i = inicio; i!= null; i=i.inf){
    for(Celula j = i; j != null; j = j.dir){
        System.out.print(j.elemento + " ");
    }
    sysout;
}

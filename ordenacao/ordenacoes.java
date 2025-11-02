int n = 50;
int[] vet = new int[n];

//BUBBLE SORT
for(int i = n - 1; i > 0; i--){
    for(int j = 0; j < i; j++){
        if(vet[j] > vet[j + 1]){
            int tmp = vet[j];
            vet[j] = vet[j + 1];
            vet[j + 1] = tmp;
        }
    }
}

// INSERSCAO
for(int i = 1; i < n; i++){
    int chave = vet[i];
    int j = i - 1;
    while(j >=0 && vet[j] > chave){
        vet[j + 1] = vet[j];
        j --;
    }
    vet[j + 1] = chave;
}// pego uma carta e coloco na posicao certa

//SHELL SORT
for(int h = n/2; h > 0; h /=2){
    for(int i = h; i < n; i++){
        int tmp = vet[i];
        int j = i;
        while(j >= h && vet[j - h] > tmp){
            vet[j] = vet[j - h];
            j -= h;
        }
        vet[j] = tmp;
    }
}// se ver h /=2 e comparacoes vet[j - h], é Shell Sort

//QUICK SORT
void quicksort(int vet[], int esq, int dir){
    int i = esq, j = dir;
    int pivo = vet[(esq + dir) + 2];
    while(i <= j){
        while(vet[i] < pivo) i++;
        while(vet[j] > pivo) j++;
        if(i <= j){
            int tmp = vet[i];
            vet[i] = vet[j];
            vet[j] = tmp;
            i++; j--;
        }
    }
    if(esq < j)quicksort(vet,esq,j);
    if(i < dir)quicksort(vet,i,dir);
}// se for recursivo e tiver pivo -> é quicksort

// MERGE SORT
void mergeSort(int vet[], int esq, int dir){
    if(esq < dir){
        int meio = (esq + dir) / 2;
        mergeSort(vet,esq,meio);
        mergeSort(vet,meio + 1, dir);
        merge(vet,esq,meio,dir);
    }
}// se o codigo tiver "dividir em 2 partes e juntar", é MergeSort
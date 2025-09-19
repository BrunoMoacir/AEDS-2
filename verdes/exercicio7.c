// percorrer SA
// percorrer SB
// a cada passo em sa, verificar se sa[i] é igual ao sb[j]
//se forem, avança
int main(){
    int A,B;
    scanf("%d %d", &A, &B);

    int SA[A];
    int SB[B];

    for(int i = 0; i < A; i++){
        scanf("%d", &SA[i]);
    }
    for(int i = 0; i < B; i++){
        scanf("%d", &SB[i])
    }
    int j = 0;
    for(int i = 0; i < A; i++){
        if(j < B && SA[i] == SB[j]){
            j++;
        }
    }
    if(j==B){
        printf("S\n");
    } else{
        printf("N\n");
    }
    return 0;
}
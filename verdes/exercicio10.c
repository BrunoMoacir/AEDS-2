#include <stdio.h>

int main(){
    int n, h, count = 0;
    scanf("%d %d", &n, &h);
    int brinquedos[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &brinquedos[i]);
        if(h >= brinquedos[i]){
            count ++;
        }
    }
    printf("%d\n", count);
    
    return 0;
}
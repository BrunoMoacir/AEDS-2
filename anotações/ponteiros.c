#include <stdio.h>

int main(){
    int x1, x2, x3; int *p;
    x1 = 11; x2 = 22; x3 = 33;
    p = &x1;
    x2 = *p;
    *p = x3;
    p = &x3;
    *p = 0;
    printf("cont: %d %d %d %d", x1, x2, x3, *p);
    printf("addr: %p %p %p %p", &x1, &x2, &x3, p);

    int y [5]= {10,11,12,13,14};
    int *p;
    int x = *p;// 10
    int x = *(p + 1); // 11
    int x = *(p + 0);//10
    *(p + 2) eh a msm coisa que p[2];
    int i = 3;
    *(p + i) eh a msm coisa que p[i];

    ///////////////////////////////////
    int x = 10;
    int *p = &x;
    (*p) ++; // x++ = 11

    return 0;
}
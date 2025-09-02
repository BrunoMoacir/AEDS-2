int somatorio PA(double a, double b, int n){
    double an = a + (n - 1) * b;
    double soma = (n * (a * an)) / 2;

    return (int) (soma + 0.5);
}
int main(){
    double a = 2.0;
    double b = 3.0;
    int n = 4;
    int resultado = somatorioPA(a, b, n);
    printf("O somatorio da PA eh: %d\n", resultado);
    return 0;
}
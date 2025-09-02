package exercicios;

public class somatorioPA {
    
    public static int somatorioPA(double a, double b, int n){
        double an = a + (n - 1) * b;
        double soma = (n * (a * an)) / 2.0;

        return (int) (soma + 0.5);
    }
}

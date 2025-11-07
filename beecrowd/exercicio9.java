import java.util.Scanner;

class Crianca {
    String nome;
    int valor;

    public Crianca(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }
}

public class exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        while (n != 0) {
            Crianca[] criancas = new Crianca[n];
            for (int i = 0; i < n; i++) {
                String nome = sc.next();
                int idade = sc.nextInt();
                criancas[i] = new Crianca(nome, idade);
            }

            Crianca vencedor = criancas[0];
            for (int j = 1; j < n; j++) {
                if (criancas[j].getValor() > vencedor.getValor()) {
                    vencedor = criancas[j];
                }
            }

            System.out.println("Vencedor(a):" + vencedor.getNome());
            n = sc.nextInt();
        }
        sc.close();
    }
}

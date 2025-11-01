// crie um programa que leia o nome e o salario de N funcionarios e mostre os funcionarios pelo salario em ordem decrescente
// em caso de salario igual o desempate e pelo nome em ordem alfabetica

// entradas:
//4
//Lucas 2500
// amanda 3000
//bruno 2500
//caio 4000
import java.util.Scanner;

class Funcionario{
    public String nome;
    public double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }
}

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();// consumir quebra de linha

        Funcionario[] vetor = new Funcionario[n];
        for(int i = 0; i < n; i++){
            String nome = sc.next();
            double salario = sc.nextDouble();
            vetor[i] = new Funcionario(nome, salario);
        }

        // ordenar bolha + alfabeto
        for(int k = n - 1; k > 0; k --){// começo do final do vetor
            for(int j = 0; j < k; j++){// menor q a var anterior
                // DECRESCENTE
                if(vetor[j].getSalario() < vetor[j + 1].getSalario()){
                    Funcionario tmp = vetor[j];
                    vetor [j] = vetor [j + 1];
                    vetor[j + 1] = tmp;
                } else if(vetor[j].getSalario() == vetor[j + 1].getSalario()){
                    if(vetor[j].getNome().compareTo(vetor[j + 1].getNome()) > 0){
                        Funcionario tmp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = tmp;
                    }
                }
            }
        }
        for(int bmchef = 0; bmchef < n; bmchef ++){
            System.out.println(vetor[bmchef].getNome() + " " + vetor[bmchef].getSalario());
        }
    }
}
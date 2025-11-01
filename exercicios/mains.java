// crie um programa que leia o nome e a nota de N alunos, e mostre os alunos ordenados pela ordem crescente
// pub.in:
//5
// Ana 8.5
//Carlos 7.0
// Beatriz 8.5
// Diego 6.0
//Eduardo 9.0

import java.util.Scanner;

class Aluno{
    public String nome;
    public double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome(){
        return nome;
    }

    public Double getNota(){
        return nota;
    }
}

public class mains{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();// consumir a quebra de linha
        Aluno[] vetor = new Aluno[n];

        for(int i = 0; i < n; i++){
            String nome = sc.next();
            double nota = sc.nextDouble();
            vetor[i] = new Aluno(nome, nota);
        }

        // ordenacao
        for(int j = n - 1; j > 0; j--){
            for(int k = 0; k < j; k++){
                if(vetor[k].getNota() > vetor[k + 1].getNota()){
                    Aluno tmp = vetor[k];
                    vetor[k] = vetor[k + 1];
                    vetor[k + 1] = tmp;
                } else if(vetor[k].getNota() == vetor[k + 1].getNota()){
                    if(vetor[k].getNome().compareTo(vetor[k + 1].getNome()) > 0){
                        Aluno tmp = vetor[k];
                        vetor[k] = vetor[k + 1];
                        vetor[k + 1] = tmp;
                    }
                }
            }
        }
        for(int bm = 0; bm < n; bm ++){
            System.out.println(vetor[bm].getNome() + " "+ vetor[bm].getNota());
        }
    }
}
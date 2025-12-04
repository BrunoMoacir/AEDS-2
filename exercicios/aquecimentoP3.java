import java.util.Scanner;

class Atleta{
    public String nome;
    public int peso;

    Atleta(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }

    public int getPeso(){
        return peso;
    }
}

public class aquecimentoP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtAtletas = sc.nextInt();
        sc.nextLine();// consumir quebra de linha

        Atleta[] atletas = new Atleta[qtAtletas];

        for(int i = 0; i < qtAtletas; i++){
            String nome = sc.next();
            int idade = sc.nextInt();
            atletas[i] = new Atleta(nome,idade);
        }

        // ordenacao bolha
        for(int j = qtAtletas - 1; j > 0; j--){
            for(int k = 0; k < j; k++){
                if(atletas[k].getPeso() < atletas[k + 1].getPeso()){
                    Atleta tmp = atletas[k];
                    atletas[k] = atletas[k + 1];
                    atletas[k + 1] = tmp;
                } else if(atletas[k].getPeso() == atletas[k + 1].getPeso()){
                    if(atletas[k].getNome().compareTo(atletas[k + 1].getNome()) > 0){
                        // > 0 troca se quiser em ordem alfabetica normal
                        // < 0 ordem alfabetica inversa
                        Atleta tmp = atletas[k];
                        atletas[k] = atletas[k + 1];
                        atletas[k + 1] = tmp;
                    }
                }
            }
        }
    }
    
}

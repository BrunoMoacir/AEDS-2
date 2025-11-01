import java.util.Scanner;

class Atleta{
    public String nome;
    public int peso;

    Atleta(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
    }

    public String getName(){
        return nome;
    }

    public int getPeso(){
        return peso;
    }    
}

public class mainnn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtAtletas = sc.nextInt();
        sc.nextLine();// consumir quebra de linha

        Atleta[] atletas = new Atleta[qtAtletas];

        for(int i = 0; i < qtAtletas; i++){
            String nome = sc.next();
            int idade = sc.nextInt();
            atletas[i] = new Atleta(nome, idade);
        }

        for(int j = qtAtletas - 1; j > 0; j--){
            for(int k = 0; k < j; k++){
                if(atletas[k].getPeso() < atletas[k + 1].getPeso()){
                    Atleta tmp = atletas[k];
                    atletas[k] = atletas[k + 1];
                    atletas[k + 1] = tmp;
                }
                else if(atletas[k].getPeso() == atletas[k + 1].getPeso()){
                    if(atletas[k].getName().compareTo(atletas[k + 1].getName()) > 0){// compareTo é usado para comparar duas string em ordem alfabetica, o >0 retorna de a primeira vem depois da segunda
                        // > 0 troca de quiser ordem alfabetica crescrente
                        // < 0 troca se quiser ordem alfabetica decrescente
                        Atleta tmp = atletas[k];
                        atletas[k] = atletas[k + 1];
                        atletas[k + 1] = tmp;
                    }
                }
            }
        }
        for(int b = 0; b < qtAtletas; b++){
            System.out.println(atletas[b].getName() + " " + atletas[b].getPeso());
        }

    }
}
import java.util.Scanner;

class Atleta{
    String nome;
    int peso;

    public Atleta(String nome, int peso){
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

public class exercicio8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            sc.nextLine();

            Atleta[] atletas = new Atleta[n];

            for(int i = 0; i < n; i++){
                String nome = sc.next();
                int peso = sc.nextInt();
                atletas[i] = new Atleta(nome,peso);
            }
            // ordenacao bolha
            for(int j = n - 1; j > 0; j--){
                for(int k = 0; k < j; k++){
                    if(atletas[k].getPeso() < atletas[k + 1].getPeso()){
                        Atleta tmp = atletas[k];
                        atletas[k] = atletas[k + 1];
                        atletas[k + 1] = tmp;
                    } else if(atletas[k].getPeso() == atletas[k + 1].getPeso()){
                        if(atletas[k].getNome().compareTo(atletas[k + 1].getNome()) > 0){
                            Atleta tmp = atletas[k];
                            atletas[k] = atletas[k + 1];
                            atletas[k + 1] = tmp;
                        }
                    }
                }
            }
            for(int b = 0; b < b; b ++){
                System.out.println(atletas[b].getNome() + " " + atletas[b].getPeso());
            }
        }
}

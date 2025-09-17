import java.util.Scanner;

public class exercicio5 {

    public static int compareStrings(String str1, String str2){
        if(str1.length() != str2.length()){
            return 1;
        }
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();

        String[] idiomas = new String[n];
        String[] traducoes = new String[n];

        for(int i = 0; i < n; i++){
            idiomas[i] = sc.nextLine();
            traducoes[i] = sc.nextLine();
        }
        int m = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < m; i++){
            String nomeCrianca = sc.nextLine();
            String idiomaCrianca = sc.nextLine();

            String traduacaoEncontrada = "";

            for(int j = 0; j < n; j++){
                if(compareStrings(idiomaCrianca, idiomas[j]) == 0){
                    traduacaoEncontrada = traducoes[j];
                    break;
                }
            }
            System.out.println(nomeCrianca);
            System.out.println(traduacaoEncontrada);
        }
        sc.close();
    }
    
}

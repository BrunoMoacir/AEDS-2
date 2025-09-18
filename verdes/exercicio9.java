import java.util.Scanner;

public class exercicio9 {

    // Classe para representar cada país e suas medalhas
    static class Pais {
        String nome;
        int ouro;
        int prata;
        int bronze;
    }

    /**
     * Compara duas strings caractere por caractere.
     * @return um valor negativo se str1 vem antes, 0 se são iguais, e positivo se str1 vem depois.
     */
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = len1 < len2 ? len1 : len2;
        int result = 0;

        for (int i = 0; i < minLen; i++) {
            if (result == 0) {
                char char1 = str1.charAt(i);
                char char2 = str2.charAt(i);
                if (char1 != char2) {
                    result = char1 - char2;
                }
            }
        }
        if (result == 0) {
            result = len1 - len2;
        }
        return result;
    }
    
    /**
     * Compara dois objetos Pais seguindo as regras de ordenação de medalhas.
     * @return um valor negativo se pais1 deve vir antes, 0 se forem iguais,
     * e um valor positivo se pais1 deve vir depois.
     */
    public static int comparePaises(Pais pais1, Pais pais2) {
        int result = 0;

        // 1. Comparação por medalhas de ouro (decrescente)
        if (pais1.ouro != pais2.ouro) {
            result = pais2.ouro - pais1.ouro;
        }

        // 2. Comparação por medalhas de prata (decrescente)
        if (result == 0) {
            if (pais1.prata != pais2.prata) {
                result = pais2.prata - pais1.prata;
            }
        }

        // 3. Comparação por medalhas de bronze (decrescente)
        if (result == 0) {
            if (pais1.bronze != pais2.bronze) {
                result = pais2.bronze - pais1.bronze;
            }
        }

        // 4. Comparação final por nome (alfabética, crescente)
        if (result == 0) {
            result = compareStrings(pais1.nome, pais2.nome);
        }

        return result;
    }

    /**
     * Ordena um array de objetos Pais usando o Insertion Sort.
     * A ordenação é baseada na nossa função comparePaises.
     */
    public static void insertionSort(Pais[] paises, int n) {
        for (int i = 1; i < n; i++) {
            Pais chave = paises[i];
            int j = i - 1;

            while (j >= 0 && comparePaises(paises[j], chave) > 0) {
                paises[j + 1] = paises[j];
                j--;
            }
            paises[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha

        Pais[] paises = new Pais[n];

        for (int i = 0; i < n; i++) {
            paises[i] = new Pais();
            paises[i].nome = sc.next();
            paises[i].ouro = sc.nextInt();
            paises[i].prata = sc.nextInt();
            paises[i].bronze = sc.nextInt();
        }

        // sc.nextLine(); // Não é necessário aqui, pois o loop usa next() e nextInt()

        insertionSort(paises, n);

        for (int i = 0; i < n; i++) {
            System.out.println(paises[i].nome + " " + paises[i].ouro + " " + paises[i].prata + " " + paises[i].bronze);
        }
        
        sc.close();
    }
}
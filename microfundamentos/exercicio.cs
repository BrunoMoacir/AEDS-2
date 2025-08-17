// implemente a pesquisa binaria para um vetor de 20 elementos inteiros em ordem crescente
// imprimir a quantidade de comparaçoes necessarias para cada pesquisa realizada
// implemente a pesquisa binaria para um vetor de 20 palavras ( ordenado alfabeticamente)
using System;

class MainClass
{
    const int TAM = 20;

    public static int cont;

    public static void preencheVetor(int[] vetor)
    {
        Random rnd = new Random();
        for (int i = 0; i < TAM; i++)
        {
            vetor[i] = rnd.Next(200);
        }
    }

    public static void printVetor(int[] vetor)
    {
        Console.Write("[");
        foreach (int item in vetor)
        {
            Console.Write(item + ",");
        }
        Console.WriteLine("]");
    }

    // pesquisa binaria, retorna -1 ou a posição
   public static int PesquisaBinaria(int[] vetor, int x, int esq, int dir)
    {
        if (esq > dir)
        {
            return -1;
        }
        else
        {
            int meio = (esq + dir) / 2;
            cont++;
            if (x == vetor[meio])
            {
                return meio;
            }
            else if (x > vetor[meio])
            {
                return PesquisaBinaria(vetor, x, meio + 1, dir);
            }
            else
            {
                return PesquisaBinaria(vetor, x, esq, meio - 1);
            }
        }
    }
}
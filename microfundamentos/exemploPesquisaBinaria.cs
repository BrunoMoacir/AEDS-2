using System;

class MainClass
{
    const int TAM = 100;
    // preenche o vetor
    public static void preencheVetor(int[] vetor)
    {
        Random rnd = new Random();
        for (int i = 0; i < TAM; i++)
        {
            vetor[i] = rnd.Next(200);
        }
    }
    // imprime na teça
    public static void printVetor(int[] vetor)
    {
        Console.write("[");
        foreach (int item in vetor)
            Console.Write(item + ",");
        Console.WriteLine("]");
    }

    public static void Main(string[] args)
    {
        int[] vetor = new int[TAM];
        preencheVetor(vetor);
        printVetor(vetor);

        Console.WriteLine("Entre com um numero: ");
        int num = Int32.Parse(Console.ReadLine());

        // ordena o vetor com o metodo nativo
        Array.Sort(vetor);
        printVetor(vetor);

        // invoca a pesquisa binaria nativa da classe array
        int resp = Array.BinarySearch(vetor, num);
        if (resp >= 0)
        {
            console.WriteLine("Elemento " + num + "encontrado");
        }
        else
            console.WriteLine("Elemento " + num + "não encontrado");
    }
}
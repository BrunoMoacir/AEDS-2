using System;
using System.Collections;
// //Faça uma classe Fila contendo um atributo do tipo ArrayList, os métodos inserir, remover e mostrar os elementos da sua fila.
class Fila
{
    ArrayList arrayList;
    public fila()
    {
        arrayList = new arrayList();
    }
    public void Inserir(int valor)
    {
        arrayList.Add(valor);
    }
    public void Remover(int valor)
    {
        int resp = (int)arrayList[0];
        arrayList.RemoveAt(0);
        return resp;
    }
    public void Mostrar()
    {
        foreach (int i in arrayList)
        {
            Console.WriteLine(i);
        }
    }
}
class ExercicioComplementar
{
    public static void Main(string[] args)
    {
        Fila fila = new Fila();
        for (int i = 0; i < 10; i++)
        {
            fila.Inserir(i);
        }
        Console.WriteLine(fila.Remover());
        fila.Inserir(10);
        Console.WriteLine(fila.Remover());
        fila.Inserir(11);
        Console.WriteLine(fila.Remover());
        fila.Inserir(12);

        Console.WriteLine("======== Mostrar");
        fila.Mostrar();
    }
}
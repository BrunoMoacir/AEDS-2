using System;
using System.Collections;

//Faça uma classe Pilha contendo dois atributos do tipo Queue, os métodos inserir, remover e mostrar os elementos da sua pilha.
class Pilha {
  Queue f1, f2;
  public Pilha (){
    f1 = new Queue();
    f2 = new Queue();
  }
  public void Inserir(int valor){
    f1.Enqueue(valor);
  }
  public int Remover(){
    while(f1.Count > 1){
      f2.Enqueue(f1.Dequeue());
    }
    int resp = (int)f1.Dequeue();
    while(f2.Count > 0){
      f1.Enqueue(f2.Dequeue());
    }
    return resp;
  }
  public void Mostrar(){
    object[] array = f1.ToArray();
    for (int i = f1.Count - 1; i >= 0; i--){
      Console.WriteLine(array[i]);
    }
  }
}
class ExercicioComplementarU02S01EC04 {
  public static void Main (string[] args) {
    Pilha pilha = new Pilha();

    for(int i = 0; i < 10; i++){
      pilha.Inserir(i);
    }
    Console.WriteLine(pilha.Remover());
    pilha.Inserir(10);
    Console.WriteLine(pilha.Remover());
    pilha.Inserir(11);
    Console.WriteLine(pilha.Remover());
    pilha.Inserir(12);

    Console.WriteLine("======== Mostrar");
    pilha.Mostrar();
  }
}
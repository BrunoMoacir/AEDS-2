// DECLARAÇÃO

int[] array = new int [10];// tem que ter o tamanho do array

String[] vetor = new String[10];

//para objetos
NomeDaClasse[] vetor = new NomeDaClasse [10];

// preenchimento array
int[] array1 = new int[5] {1,3,5,7,9};
int[] array2 = {1,2,3,4,5};

int[] array = new int[50];
for(int i = 0; i < 50; i++){
    array[i] = i + 1;
}
// ACESSAR OS DADOS
array[10] = 50;
// ou
Console.WriteLine(array[10]);

for(int i = 0; i < 10; i++){
    Console.WriteLine(array[i]);
}
// exemplo while

while(i < 10){
    Console.WriteLine(array[i]);
    i++;
}

// exemplo for each
foreach(int x in array){// todo elemento que tiver no vetor é acessado
    Console.WriteLine(x);
}
string[] pilotos = new string[4]{"Ayrton", "Hamilton","Michael", "Lewis"};
Console.WriteLine(pilotos[3]);

pilotos[3] = "Rubens";
foreach(string piloto in pilotos){
    Console.WriteLine(piloto);
}
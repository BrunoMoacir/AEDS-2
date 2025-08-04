public void maiorMenor (int[] array){
    int maior = array[0];
    int menor = array[0];

    for(int i = 0; i < array.length; i++){
        if(array[i] > maior){
            maior = array[i];
        }
        if(array[i] < menor){
            menor = array[i];
        }
    }
    System.out.println("Maior = " + maior);
    System.out.println("Menor = " + menor);
}
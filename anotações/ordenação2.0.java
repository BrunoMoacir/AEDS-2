public class ordenação2.0 {
    
    public void selectionSort(int[] array){
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            int indexMenor = i;
            for(int j = i + 1; j < n; j++){
                if(array[j] < array[indexMenor]){
                    indexMenor = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexMenor];
            array[indexMenor] = temp;
        }
    }

    public void insertionSort(int[] array){
        int n = array.length;
        for(int i = 1; i < n; i++){
            int chave = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > chave){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1];
        }
    }

    public void bubbleSort(int[] array){
        int n = array.length;
        for(int i = 0; i < n - 1; i++){
            boolean trocou = false;
            for(int j = 0; j < n-1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            }
            return trocou;
        }
    }
}

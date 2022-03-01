package QuickSort;

public class QuickSort {
    static void QuickSort(int[] arr, int low, int high) {
        if (low < high) { //Calling QuickSort if needed
            int pi = Partitioning(arr, low, high);
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    private static int Partitioning(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; //On which position in the array we are
        for (int j = low; j < high; j++) { //Swapping if needed(arr[j] < pivot)
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[high]; //Swapping numbers(elements)
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;
        return i+1;//Returning Integer because our function wants int number to be returned
    }
}

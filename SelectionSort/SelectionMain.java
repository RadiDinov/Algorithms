package SelectionSort;

import java.util.Arrays;

public class SelectionMain {
    public static void main(String[] args) {
        int[] arr = { 25, 8, 77, 43, 12, 36, 91, 5 };
        int currmin = 0;
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[currmin]) {
                    swap = arr[j];
                    arr[j] = arr[currmin];
                    arr[currmin] = swap;
                }
            }
            currmin = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}

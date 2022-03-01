package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Length of Array: ");
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        int swap_time = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter element <%d>: ", i);
            int temp = Integer.parseInt(scan.nextLine());
            arr[i] = temp;
        }
        System.out.println("Before sorting:" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap_time++;
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    System.out.printf("Interaction <%d>: " + Arrays.toString(arr), swap_time, swap_time);
                    System.out.println();
                }
            }
        }
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}

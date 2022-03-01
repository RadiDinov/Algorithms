package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleMainDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert number of elements: ");
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Please input element [%d]: ", i);
            arr[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.println("BEFORE SORTING: ");
        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println("AFTER SORTING: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr) {
        boolean sorted;
        do {
            sorted = false;
            int sort;
            int n = arr.length;

            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    sort = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = sort;
                    sorted = true;
                }
            }
        } while (sorted);
    }
}

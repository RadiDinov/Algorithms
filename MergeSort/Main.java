package MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of elements : ");
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Input element "+ i +": ");
            arr[i] = Integer.parseInt(scan.nextLine());
        }

        System.out.println("BEFORE MERGE SORT: " + Arrays.toString(arr));

        MergeSort.SortMethod(arr,0,arr.length-1);

        System.out.println("AFTER MERGE SORT: " + Arrays.toString(arr));

        scan.close();

    }
}

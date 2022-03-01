package QuickSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Please input the number of elements! :)");
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];//Creating new array with name arr and length n
        for(int i = 0; i < n; i++) { //Inserting numbers in arr[] from the console
            System.out.printf("Please input [%d] element of array", i);
            arr[i] = scan.nextInt();
        }
        System.out.println("Before sort: " + Arrays.toString(arr)); //Results before QuickSort
        QuickSort.QuickSort(arr, 0, n-1); //QuickSort is called
        System.out.println("After sort: " + Arrays.toString(arr)); //Results after QuickSort
        scan.close();//Closing Scanner
    }
}

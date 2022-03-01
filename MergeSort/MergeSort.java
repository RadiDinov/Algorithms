package MergeSort;

public class MergeSort {
    public static void SortMethod(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2; // Finding the middle of the array we want to sort

            SortMethod(arr, l, m);// Sort left
            SortMethod(arr, m + 1, r);// Sort right

            Merge(arr, l, m, r); // Merge all divided Arrays
        }
    }

    public static void Merge(int[] arr, int l, int m, int r) {
        int[] leftArr = new int[m - l + 1]; //getting l into an Arr
        int[] rightArr = new int[r - m]; //getting r into an Arr

        for (int i = 0; i < leftArr.length; i++) //inserting integers from arr to leftArr
            leftArr[i] = arr[l + i];
        for (int i = 0; i < rightArr.length; i++) //inserting integers from arr to leftArr
            rightArr[i] = arr[m + 1 + i];

        int leftIndex = 0; //integer's index in the l part(after dividing)          { 2, 5, 8, 10, 11 }
        int rightIndex = 0; //integer's index in the r part(after dividing)           | left | |right|

        for (int i = l; i < r + 1; i++) { //if there are excess integers in l and r. Getting the minimum of the two
            if (leftIndex < leftArr.length && rightIndex < rightArr.length) {
                if (leftArr[leftIndex] < rightArr[rightIndex]) {
                    arr[i] = leftArr[leftIndex];
                    leftIndex++;
                } else {
                    arr[i] = rightArr[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArr.length) { //if all integers are done in the rightArr. Doing the same for leftArr
                arr[i] = leftArr[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArr.length) { //if all integers are done in the leftArr. Doing the same for rightArr
                arr[i] = rightArr[rightIndex];
                rightIndex++;
            }
        }
    }

}

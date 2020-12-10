//Find the maximum and minimum element in an array using minimum number of comparisons
public class MaxMinOfArray {
    public static void main(String[] args) {
        int[] arr = { 2, 9, 6, 3, 1 };
        getMaxMinElem(arr, arr.length);
    }

    public static void getMaxMinElem(int[] arr, int arrSize) {

        int min = 0;
        int max = 0;
        int i = 0;

        // even
        if (arrSize % 2 == 0) {
            if (arr[i] <= arr[i + 1]) {
                min = (min < arr[i]) ? min : arr[i];
                max = (max > arr[i + 1]) ? max : arr[i + 1];
            } else {
                min = (min < arr[i + 1]) ? min : arr[i + 1];
                max = (max > arr[i]) ? max : arr[i];
            }
            i = 2;
        }

        // odd
        else {
            min = arr[0];
            max = arr[0];
            i = 1;
        }

        while (i < arrSize - 1) {
            if (arr[i] <= arr[i + 1]) {
                min = (min < arr[i]) ? min : arr[i];
                max = (max > arr[i + 1]) ? max : arr[i + 1];
            } else {
                min = (min < arr[i + 1]) ? min : arr[i + 1];
                max = (max > arr[i]) ? max : arr[i];
            }
            i += 2;
        }

        System.out.println("Maximum element is: " + max + ", Minimum is: " + min);

    }
}

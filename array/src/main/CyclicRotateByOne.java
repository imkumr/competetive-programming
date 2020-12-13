/* Program to cyclically rotate an array by one

Given an array, cyclically rotate the array clockwise by one.

Examples:
Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}

*/

public class CyclicRotateByOne {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        getCyclicArrayRotation(arr, arr.length);
    }

    public static void getCyclicArrayRotation(int[] arr, int arrSize) {

        // int temp = 0;
        int last = arr[arrSize - 1];

        for (int i = arrSize - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.println("Array after rotation is :");

        for(int i : arr){
            System.out.println(i + " ");
        }

    }

}
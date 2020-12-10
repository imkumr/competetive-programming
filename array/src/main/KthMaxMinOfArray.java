import java.util.Arrays;

/*  Given an array arr[] and a number K where K is smaller than size of array, 
    the task is to find the Kth smallest element in the given array. 
    It is given that all array elements are distinct.
*/

public class KthMaxMinOfArray {

    public static void main(String[] args) {
        KthMaxMinOfArray maxMinOb = new KthMaxMinOfArray();
        int[] arr = { 5, 4, 3, 1, 2, 9, 8 };
        int k = 3;
        maxMinOb.getKthMaxNmin(arr, k);
    }

    public int getKthMaxNmin(int[] arr, int k) {

        if (arr.length > 0 && k <= arr.length) {
            Arrays.sort(arr);
            return arr[k - 1];
        } else
            return 0;
    }

}

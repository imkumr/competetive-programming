package ArrayProblems;

import java.util.Arrays;

/* Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, 
also in sorted non-decreasing order.

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Note:

1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.
*/
class SquaresOfSortedArray {

    public static void main(String[] args) {

        int arr[] = { -4, -1, 0, 3, 10 };

        for (int i : sortedSquares(arr)) {
            System.out.print(i + " ");
        }

    }

    public static int[] sortedSquares(int[] A) {

        /*
         * if(A.length >= 1 && A.length <= 10000 ){ for (int i = 0; i < A.length; i++) {
         * if(A[i] >= -10000 && A[i] <= 10000 ){ A[i] = A[i] * A[i]; } } Arrays.sort(A);
         * }
         */
        if (A.length >= 1 && A.length <= 10000)
           // A = Arrays.stream(A).filter(i -> i >= -10000 && i <= 10000).map(a -> a * a).sorted().toArray();
           A = Arrays.stream(A).parallel().filter(i -> i >= -10000 && i <= 10000).map(a -> a * a).sorted().toArray();

        return A;
    }

}
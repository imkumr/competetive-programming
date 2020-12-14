/* Kadane's Algorithm

Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Example 1:

Input:
N = 5
arr[] = {1,2,3,-2,5}
Output: 9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.
 

Example 2:

Input:
N = 4
arr[] = {-1,-2,-3,-4}
Output: -1
Explanation: Max subarray sum is -1 of element (-1)
*/

public class LargestContigousSubArr {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -2, 5 };
        maxSubArraySum(arr, arr.length);
    }

    public static int maxSubArraySum(int[] arr, int arrSize) {

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arrSize; i++) {

            currentSum = currentSum + arr[i];

            if (currentSum > maxSum)
                maxSum = currentSum;

            if (currentSum < 0)
                currentSum = 0;

        }

        System.out.println("Max Sum is: " + maxSum);

        return maxSum;
    }

}
import java.util.Arrays;

/* Minimize the heights

Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower 
either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 

Find out what could be the possible minimum difference of the height of shortest and 
longest towers after you have modified each tower. 

Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}

Output: 5
Explanation: The array can be modified as {3, 3, 6, 8}. The difference between the largest and the smallest is 8-3 = 5.
*/

public class MinimiseHeights {

    public static void main(String[] args) {
        MinimiseHeights minimiseHeight = new MinimiseHeights();

        int[] arr = { 1, 5, 8, 10 };

        int k = 2;

        int minHeight = minimiseHeight.getMinimumHeight(arr, arr.length, k);

        System.out.println("Minimised height is: " + minHeight);

    }

    private int getMinimumHeight(int[] arr, int len, int k) {

        if (len == 1) {
            return 0;
        }

        Arrays.sort(arr);

        int initHeight = arr[len - 1] - arr[0];

        int temp = 0;

        int shortTower = arr[0] + k;
        int longTower = arr[len - 1] - k;

        if (shortTower > longTower) {
            temp = shortTower;
            shortTower = longTower;
            longTower = temp;
        }

        for (int i = 1; i < len - 1; i++) {

            int sub = arr[i] - k;
            int add = arr[i] + k;

            if (sub >= shortTower || add <= longTower)
                continue;

            if (longTower - sub <= add - shortTower)
                shortTower = sub;
            else
                longTower = add;

        }

        return Math.min(initHeight, longTower - shortTower);

    }
}
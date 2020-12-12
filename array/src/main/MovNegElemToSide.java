/*
An array contains both positive and negative numbers in random order. 
Rearrange the array elements so that all negative numbers appear before all positive numbers.
Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
*/

class MovNegElemToSide {
    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, 6 };
        // movElemToSide(arr, arr.length);

        getArraySortedBytwoPointers(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public static int[] movElemToSide(int[] arr, int arrSize) {

        int temp = 0;
        int j = 0;

        for (int i = 0; i < arrSize; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        return arr;
    }

    public static int[] getArraySortedBytwoPointers(int[] arr, int left, int right) {

        while (left <= right) {
            if (arr[left] < 0 && arr[right] < 0)
                left++;
            // swap
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            // decrement from right and check left with other elements
            else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            }
            // current position is correct
            else {
                left++;
                right--;
            }
        }
        return arr;
    }
}
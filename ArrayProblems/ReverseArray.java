package ArrayProblems;

class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 0, 3, 10 };

        // System.out.println(getArrayReversed(arr));

        /*for (int i : getArrayReversed(arr, 0, arr.length - 1)) {
            System.out.print(i + " ");
        }*/

        getArrayRevByRecursion(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] getArrayReversed(int arr[], int start, int end) {
        // int tempArr[] = new int[arr.length];
        // int j = 0;
        // for (int i = arr.length - 1; i >= 0; i--) {
        // tempArr[j] = arr[i];
        // j++;
        // }
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    public static void getArrayRevByRecursion(int arr[], int start, int end) {
        int temp;

        if(start >= end)
            return;
        
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        getArrayRevByRecursion(arr, start + 1, end - 1);
    }

}
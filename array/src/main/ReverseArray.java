package array.src.main;

class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 0, 3, 10 };
        getArrayRevByRecursion(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] getArrayReversed(int[] arr, int start, int end) {

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

        if (start >= end)
            return;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        getArrayRevByRecursion(arr, start + 1, end - 1);
    }

}
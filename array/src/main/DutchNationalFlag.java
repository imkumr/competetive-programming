public class DutchNationalFlag {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        getThreePartIndicesSorted(arr, arr.length);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void getThreePartIndicesSorted(int[] arr, int size) {
        int low = 0;
        int mid = 0;
        int high = size - 1;

        int temp = 0;

        // 0 to n-1
        while (mid <= high) {
            // swap to lows if middle element is 0
            if (arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            // middle element is 1, then no change
            else if (arr[mid] == 1) {
                mid++;
            }
            // swap to high, if middle element is 2
            else if (arr[mid] == 2) {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }

        }
    }

}

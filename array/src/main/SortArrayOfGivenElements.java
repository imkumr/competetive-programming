/*Given an array which consists of only 0, 1 and 2. 
Sort the array without using any sorting algo.*/

class SortArrayOfGivenElements {

    public static void main(String[] args) {

        int[] arr = { 0, 2, 1, 2, 0 };

        sortArrayElements(arr, arr.length);

        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public static int[] sortArrayElements(int[] arr, int arrSize) {

        int zeroCnt = 0;
        int oneCnt = 0;

        if (arrSize == 0)
            return arr;

        for (int i : arr) {
            if (i == 0)
                zeroCnt++;
            else if (i == 1)
                oneCnt++;
            // else if (i == 2)
            // twoCnt++;
        }

        for (int i = 0; i < arrSize; i++) {
            if (i < zeroCnt)
                arr[i] = 0;
            else if (i < zeroCnt + oneCnt)
                arr[i] = 1;
            else
                arr[i] = 2;
        }

        return arr;
    }

}
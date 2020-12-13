/* 
Given two arrays A and B of size N and M respectively.The task is to find union & intersection between these two arrays.
Union of the two arrays can be defined as the set containing distinct elements from both the arrays. 
And intersection means common element in both the arrays.
If there are repetitions, then only one occurrence of element should be printed in union.
*/

public class TwoArrayUnion {
    public static void main(String[] args) {
        int[] firstArr = { 1, 2, 2, 32, 54, 55, 56, 80 };
        int[] secArr = { 2, 6, 33, 80, 80 };

        // Only works for non-duplicate cases
        getIntersectionOfArrays(firstArr, firstArr.length, secArr, secArr.length);

        getUnionOfArrays(firstArr, firstArr.length, secArr, secArr.length);

    }

    public static void getIntersectionOfArrays(int[] firstArr, int firstArraySize, int[] secArr, int secArraySize) {
        int x = 0;
        int y = 0;

        while (x < firstArraySize && y < secArraySize) {
            if (firstArr[x] < secArr[y]) {
                x++;
            } else if (firstArr[x] > secArr[y]) {
                y++;
            } else {
                System.out.println(firstArr[x] + " ");
                x++;
                y++;
            }
        }
    }

    public static void getUnionOfArrays(int[] firstArr, int firstLen, int[] secArr, int secLen) {

        int[] distinctArr = new int[firstLen + secLen];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < firstLen && j < secLen && k < firstLen + secLen) {
            if (firstArr[i] > secArr[j]) {
                distinctArr[k] = firstArr[i];
                i++;
                k++;
            } else if (firstArr[i] < secArr[j]) {
                distinctArr[k] = secArr[j];
                j++;
                k++;
            } else {
                distinctArr[k] = firstArr[i];
                i++;
                j++;
                k++;
            }
        }

        while (i < firstLen) {
            distinctArr[k] = firstArr[i];
            k++;
            i++;
        }
        while (j < secLen) {
            distinctArr[k] = secArr[j];
            k++;
            j++;
        }

        System.out.println("No of distinct elements in both the set: " + k);

        for (int a = 0; a < k; a++) {
            System.out.print(distinctArr[a] + " ");
        }
    }
}
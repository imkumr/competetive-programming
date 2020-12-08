package ArrayProblems;
/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.

Note:
The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000

Hint:
You need to think about two things as far as any window is concerned. 
One is the starting point for the window. How do you detect that a new window of 1s has started? 
The next part is detecting the ending point for this window. 
How do you detect the ending point for an existing window? 
If you figure these two things out, you will be able to detect the windows of consecutive ones. 
All that remains afterward is to find the longest such window and return the size.
*/

class Maximum_Consecutive_Ones_In_Array {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println("Maximum consecutive Ones is: " + findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int currentVal = 0, maxVal = 0;

        if (nums.length > 0 && nums.length <= 10000) {
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == 1) {
                    currentVal++;

                } else {

                    if (maxVal < currentVal)
                        maxVal = currentVal;

                    if (maxVal >= (nums.length / 2))
                        return maxVal;

                    currentVal = 0;
                }
            }
        }

        if (maxVal < currentVal)
            maxVal = currentVal;

        return maxVal;
    }
}
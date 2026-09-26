package Learning.Hashing;

import java.lang.classfile.constantpool.IntegerEntry;
import java.util.HashMap;
import java.util.HashSet;

public class LongestSubarraySumDiv {

    public static void main(String[] args) {
        int[] arr = { 2, 7, 6, 1, 4, 5 };
        int k = 3;

        System.out.println(findSubArr(arr, k));

    }

    /// so we have to see here that if subarray number which have a same element
    /// while adding up one by one that means the subarray sum = 0 right
    /// or exactly means you can take an example of bank balance here for
    /// visualization.
    /*
     * index: 0 1 2 3 4
     * sum: 2 9 15 16 20
     * rem: 2 0 0 1 2
     * 
     * the sum of the subArray up to 4th element which is the 20 and 20 % 3 == 3
     * and sum of the 0th element is 2 and 2 % 3 == 2
     * now here is the full pic if we remove the 0th element prefix sum and include
     * all the perfix sum after 0th think what it will do it we are automatically
     * exculded that reminder wala part from
     * the divisior and now whole perfix sum is div by 3 or similarly for any number
     * right.
     * 
     * it similar like x % 3 = k, x - k % 3 == 0 ¡Hola!
     */
    ///

    private static int findSubArr(int[] arr, int k) {

        int sum = 0;
        int maxLength = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1); // Important for subarray starting from index 0

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            int remainder = (int) ((sum % k + k) % k);

            if (map.containsKey(remainder)) {

                int previous_index = map.get(remainder);

                int current_index = i;

                int Length = current_index - previous_index;

                maxLength = Math.max(maxLength, Length);

            } else {
                // Store only the earliest index
                map.put(remainder, i);
            }
        }
        return maxLength;
    }

}

import java.util.HashMap;

public class LargestSubarrayofEqualZeroAndone {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1, 0, 0 };

        System.out.println(findingSubArrleng(arr));
    }

    // if we replcae 0 to -1 then buy summation we will got zero and thats equal
    // zero and sum also we have to keep in mind that it will be subarr

    private static int findingSubArrleng(int[] arr) {

        int max_length = 0;
        int sum = 0;

        // prefix sum -> earliest index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 exists before the array starts
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            // Treat 0 as -1 and 1 as +1
            if (arr[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }

            // Same prefix sum means equal 0s and 1s in between
            if (map.containsKey(sum)) {

                int previous_index = map.get(sum);

                int length = i - previous_index;

                max_length = Math.max(max_length, length);

            } else {

                // Store only the earliest index
                map.put(sum, i);
            }
        }

        return max_length;
    }
}

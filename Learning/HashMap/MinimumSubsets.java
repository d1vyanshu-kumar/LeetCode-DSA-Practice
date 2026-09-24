package Learning.HashMap;

import java.util.HashMap;

public class MinimumSubsets {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5};

        System.out.println(minSubDist(arr));
    }

    private static int minSubDist(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int max = 0;
        
        // look if we notice the pattern then the element  which have a hig freq is the how much min sub set will formed!

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            max = Math.max(max, map.get(arr[i])); /// and here we go!!!
        }

        return max;
        

    }
}

package Learning.HashMap;

import java.util.HashMap;

public class Count_Pairs_with_Sum {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1 };
        int target = 2;

        System.out.println(countPair(arr, target));
    }

    private static int countPair(int[] arr, int target) {

        // lets go through the brute force approach!!

        // int count = 0;

        // for (int i = 0; i < arr.length; i++) {

        // int j = arr.length - 1;

        // while (i < j) {
        // if (arr[i] + arr[j] == target) {
        // count++;
        // }
        // j--;
        // }

        // }

        // return count;
        // time complexity : O(N^2).

        // ------------------------------------------------------------------------------------------------------------------------

        /// lets think what wil be the best approach for this question let me thinkkkkkk
        /// this
        ///
        ///

        // HashMap<Integer, Integer> map = new HashMap<>();
        // int ans = 0;

        // for (int i = 0; i < arr.length; i++) {

        //     map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); // i am inserting all the element inside the map with freq step -1
        // } 

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > target) {
        //         continue;
        //     }
        //     int freq = target - arr[i];

        //     if (map.getOrDefault(freq, 0) > 0) {
        //         ans += map.get(freq);
        //         map.put(arr[i], map.get(arr[i]) - 1); // update the current value which is u just inserted in the step 1. "1-1 = 0"

        //         if (arr[i] == freq) {
        //           ans -= 1;
        //         }
        //     }
        // }

        // return ans;





        //---------------------------------------------------------------------------------------------------------

        HashMap<Integer, Integer> map= new HashMap<>();     
        int ans = 0;   

        for (int i = 0; i < arr.length; i++) {
            
            int searchNo = target - arr[i];

            if (arr[i] > target) {
                continue;
            }

            ans += map.getOrDefault(searchNo, 0);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }

        return ans;
        
    }
}

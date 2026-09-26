package Learning.HashMap;

import java.util.HashSet;

public class ZeroSumSubarray {
    public static void main(String[] args) {

        int[] arr = { 10, -2, 2, -5 };
        int target = 0;

        /// 10
        /// 8
        /// 10
        /// 5

        System.out.println(findZeroSum(arr, target));
    }

    private static boolean findZeroSum(int[] arr, int target) {

        int sum = 0;

        HashSet<Integer> previous_sum = new HashSet<>();

        for (int i : arr) {

            sum += i;

            // checking if the current sum is in the subset or not if not then we will add the current sum;
            
            if (previous_sum.contains(sum)) {
                return true;
            }else if (sum == target) {
                return true;
            }

            previous_sum.add(sum);
        }

        return false;
    }
}

/// START
//   │
//   │ +10
//   ▼
//  10   ← first 10
//   │
//   │ -2
//   ▼
//   8
//   │
//   │ +2
//   ▼
//  10   ← second 10
//   │
//   │ -5
//   ▼
//   5

///Now look only at these two points:

// first 10  ────────────────>  second 10

// We started that section at 10 and ended that section at 10.

// So what was added in between?

// 10
//  + (-2)
//  + 2
// -------
// 10
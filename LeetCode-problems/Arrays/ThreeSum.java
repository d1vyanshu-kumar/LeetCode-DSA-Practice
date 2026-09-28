import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = { -1, 0, 1, 2, -1, -4 };

        System.out.println(findSum(nums));
    }

    private static List<List<Integer>> findSum(int[] arr) {

        // nums[i] + nums [j] + nums[j] = 0;

        // such that i and j and k will not be dublicate;

        // if this arr will be the sorted then

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> triplet = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        System.out.println("---------" + Arrays.toString(arr));

        // for (int i = 0; i < arr.length - 2 ; i++) {
        // // if (arr[i] + arr[i+1] + arr[i+2] == 0 && arr[i] != arr[i+1] && arr[i+1] !=
        // arr[i+2] && arr[i] != arr[i+2] ) {
        // // list.add(List.of(arr[i], arr[i+1], arr[i+2]));

        // // }
        // // int sum = 0;

        // // if () {

        // // }
        // }

        // find all triplet;;;

       for (int i = 0; i < arr.length - 2; i++) {
            // Skip duplicate values for the fixed element
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = arr.length - 1;

            // 3. Two pointers for the remaining sum
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    list.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    // Skip duplicate values for left and right pointers
                    while (left < right && arr[left] == arr[left + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Need a larger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
        }

        return list;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

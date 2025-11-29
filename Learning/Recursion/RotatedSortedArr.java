public class RotatedSortedArr {
    public static void main(String[] args) {
        // find target in a rotated sorted array....better watch the binary search code
        // if u don't understand things

        int[] nums = { 5, 6, 7, 1, 2, 3, 4 };
        int target = 90;

        System.out.println(findTarget(nums, target, 0, nums.length - 1));

    }

    // look for every recursion call we need to change the start and end and we
    // better know how can we handle this
    // the thing is going to same is "mid";
    static int findTarget(int[] nums, int target, int start, int end) {

        // base condition:

        if (end < start) {
            return -1;
        }

        // --------------------------------//

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        // lets GoooOO...

        if (nums[start] <= nums[mid]) {
            // now this means we are in a sorted Ascending....

            if (target >= nums[start] && target <= nums[mid]) {
                return findTarget(nums, target, start, mid - 1);
            } else {
                return findTarget(nums, target, mid + 1, end);
            }

        }

        // it feel like confusing some time....take pen and paper ;\

        // if the first half is not sorted then move to the other part and checking that
        // part is sorted or not

        if (target >= nums[mid] && target <= nums[end]) {
            return findTarget(nums, target, mid + 1, end);
        }
        return findTarget(nums, target, start, mid - 1);
    }
}

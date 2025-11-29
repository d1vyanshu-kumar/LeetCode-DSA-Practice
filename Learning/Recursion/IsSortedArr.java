public class IsSortedArr {

    public static void main(String[] args) {
        // how can we we find is the given arr is sorted or not
        // we just need to find the recursion pattern in array
        // in simple way how can we see is the array is sorted or not just by comparing
        // each element to next element..
        // we can find pattern here: check ith to (i+1)th element and change the index
        // with respect to element.
        // and if we are at the last index then return true!

        int[] arr = { 1, 2, 5 , 9};

        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr) {

        return helper(arr, 0);
    }

    static boolean helper(int[] nums, int index) {

        // base case
        // finding base condtion required some time pen and paper...it is the key thing other wise Stackoverflow 

        if (index >= nums.length - 1) {
            return true;
        }

        // we need to check the nums[i] and nums[i+ 1]

        if (nums[index] < nums[index + 1] && helper(nums, index + 1)) {
            return true;
        } else {
            return false;
        }
    }
}
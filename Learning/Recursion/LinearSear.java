public class LinearSear {
    public static void main(String[] args) {
        int[] nums = { 10, 10 };
        int target = 10;
        System.out.println(findTarget(nums, target, 0));
        System.out.println(findIndexLast(nums, target, nums.length - 1));
    }

    // we need to find the target element in an array! return index

    static int findTarget(int[] arr, int target, int index) {

        // base condition

        if (index + 1 > arr.length) {    // ; ) --------- ( ;2
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return findTarget(arr, target, index + 1);
    }

    static int findIndexLast(int[] arr, int target, int index){

        // base condition
        if (index < 1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

         return findIndexLast(arr, target, index - 1);

    }
}


// love it....XoxOOooo ;)
public class MaximumuSubarr {

    public static void main(String[] args) {

        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println(findingMaxSubArrSum(nums));
    }

    private static int findingMaxSubArrSum(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i]; // cal the sum and the compare the previous sum

            if (maxSum < sum) {
                maxSum = sum;
            }
            // we don't know the size of the arr  so reset here....

            if(sum < 0){
                sum = 0;
            }
        }

        return maxSum;
    }

}

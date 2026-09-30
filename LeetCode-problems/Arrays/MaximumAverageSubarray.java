public class MaximumAverageSubarray {

    public static void main(String[] args) {

        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 1;

        System.out.println(findMaxAvgSubArr(nums, k));
    }

    private static double findMaxAvgSubArr(int[] arr, int k) {

        double maxAvg = Integer.MIN_VALUE;

        double sum = 0.000;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (i == k - 1) {
                avg = sum / k;
            } else if (i >= k) {
                sum -= arr[i - k];
                avg = sum / k;
            }

            // maxAvg = Math.max(maxAvg, avg);

            if (maxAvg < avg) {
                maxAvg = avg;
            }

        }

        return maxAvg;
    }
}

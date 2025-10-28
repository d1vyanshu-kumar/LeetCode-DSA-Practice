public class SearchInRotatedArr_33 {

    public static void main(String[] args) {
        // given a rotated array and we need to find target in this arr...

        int[] nums = { 5, 1, 3 };
        int target = 5;

        // this is given that the rotated arr is sorted in the acc order previously.

        // so what i am thinking now we need to find the peak element and from there we
        // are going to find the taget in those two parts of subarray which is in
        // accending order.

        int ans = findTarget(nums, target, true);

        if (ans == -1) {
            ans = findTarget(nums, target, false);
        }

        System.out.println(ans);

    }

    // find the peak element and after finding that after that execute the binary
    // search both side and find the target.

    static int findingPeakElementIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // mid is the peak
                return mid;
            }

            if (arr[mid] >= arr[start]) {
                // peak is to the right
                start = mid + 1;
            } else {
                // peak is to the left
                end = mid - 1;
            }
        }

        return start; // or end, since they converge
    }

    static int findTarget(int[] arr, int target, boolean findingInLeft) {

        int peakElement = findingPeakElementIndex(arr);
        int finalAns = -1;

        if (findingInLeft) {
            int startLeft = 0;
            int endLeft = peakElement;

            while (startLeft <= endLeft) {

                int midLeft = startLeft + (endLeft - startLeft) / 2;
                if (arr[midLeft] > target) {
                    endLeft = midLeft - 1;
                } else if (arr[midLeft] < target) {
                    startLeft = midLeft + 1;
                } else {
                    return midLeft;
                }
            }
        } else {
            int startRight = peakElement + 1;
            int endRight = arr.length - 1;

            while (startRight <= endRight) {

                int midRight = startRight + (endRight - startRight) / 2;

                if (arr[midRight] > target) {
                    endRight = midRight - 1;
                } else if (arr[midRight] < target) {
                    startRight = midRight + 1;
                } else {
                    return midRight;
                }
            }
        }

        return finalAns;
    }

}

public class findMinElem_153 {

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };

        // find the minumum element in the rotated array

        // here is the simple and very efficeint as per me
        // find the max element and write binary search for small lowest element for
        // both left and right w.r.t the big element and compare and get answer and
        // check postion of the element as well.

        // System.out.println(findMaxElement(nums));

        int peak = findMaxElement(nums);

        if (peak == (nums.length - 1)) {
            System.out.println(nums[0]);
        } else {
            System.out.println(nums[peak + 1]);
        }

    }

    static int findMaxElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return start;

    }
}

// this is a very important you need to keep this in mind when you try to get
// the peak element in rotated array look in RA we dont just compare with the
// next element cause you know like array is rotated so u are not sure that u
// are in the left and right so here is very important catch just compare with
// the start or end okay. like i did in the above code from there we can get
// idea where are u and what u need to do. okay so keep this in mind.

import java.util.Arrays;

public class TwosumII_167 {

    public static void main(String[] args) {
        int[] numbers = { -1,0};
        int target = -1;

        System.out.println(Arrays.toString(twoSUM(numbers, target)));
    }

    static int[] twoSUM(int[] nums, int target) {

        // using one pointer and searched in the new next array and if the sums of the
        // new that element which we will take for pointer and the checking each element
        // of the new array is target then return that other wise after checking each
        // element we will move our pointer.

        // but i am also thinking another optimal approach;

        // okay so here is the another approch we are using two pointer here, and look
        // the sum is exactly equals to the target okay so what not greater and not
        // smaller so if by checking if we found the result is smaller the we are going
        // to move the pointer to right okay ans visa verse for the if we found the
        // result element is geater then target.

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            if ((nums[start] + nums[end])== target) {
                return new int[] { start + 1, end + 1 };
            }

            if ((nums[start] + nums[end]) > target) {
                end --;
            }else{
                start++;
            }
        }

        return new int[] {-1,-1};
    }
}

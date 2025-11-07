/*
 * ELEMENT AT THE CORRECT POSITION.
 */

import java.util.Arrays;
import java.util.List;

public class FindDisNo_448 {

    public static void main(String[] args) {
        // we need to find the dissappeared number in the provided range.
        /*
         * Given an array nums of n integers where nums[i] is in the range [1, n],
         * return an array of all the integers in the range [1, n] that do not appear in
         * nums.
         */

        // as in the question Range is defined so we know what to do!

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println((findMissingEle(nums)));

    }

    /*
     * look what i am thinking is we are going to to sort an array and after sprting
     * of the index is not equal to the number -1 or like the number is not equal to
     * the index - 1 then we are take that index - 1 element and put that inside a
     * new array and return that new array.
     */

    static List<Integer> findMissingEle(int[] nums) {

        int index = 0;
        while (index < nums.length) {
            int correctIndex = nums[index] - 1;

            if (nums[index] <= nums.length && nums[index] != nums[correctIndex]) {
                swap(nums, index, correctIndex);
            } else {
                index++;
            }
        }

        java.util.List<Integer> missing = new java.util.ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                missing.add(i + 1);
            }
        }
        return missing;
    }

    static void swap(int[] nums, int firstIndex, int secondIndex) {
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}

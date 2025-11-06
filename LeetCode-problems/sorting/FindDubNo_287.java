import java.util.Arrays;

public class FindDubNo_287 {

    // https://leetcode.com/problems/find-the-duplicate-number/description/

    public static void main(String[] args) {
        /*
         * Given an array of integers nums containing n + 1 integers where each integer
         * is in the range [1, n] inclusive.
         * 
         * There is only one repeated number in nums, return this repeated number.
         * 
         */

        int[] nums = {1,3,4,2,2};

        /*
         * here is how we can solve this issue first of fall it is given that range of
         * each integer in [1,n] so what that means is we need to apply cyclic sort this
         * the first this whch will going to come in our mind
         * 
         * here each number started with 1 to n so we are going to sort and return that
         * element which is not same as it value - 1 or index + 1 okay.
         */

         System.out.println(findDub(nums));

    }
    

    // approch 1 which is right approach for this question 

    static int findDub(int [] nums){

        int i = 0;
        while (i < nums.length) {
            
            if (nums[i] != i+1) {
                int correctPosition = nums[i] - 1;

                if (nums[i] != nums[correctPosition]) {
                    swap(nums, i, correctPosition);
                }else{     // it already contains dublicate element at the postion so we found our answer. gotchaaaaa....
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }

        return -1;
    }


    // approch 2



    // static int findDub(int [] nums){

    //     int checkingIndex = 0;

    //     while (checkingIndex < nums.length) {
    //         int isItOnCorrectIndex = nums[checkingIndex] - 1;  // look if u confused here then please go watch cyclic sort lecture.

    //         if (nums[checkingIndex] != nums[isItOnCorrectIndex]) {
    //          swap(nums,checkingIndex,isItOnCorrectIndex);
    //         }else{
    //             checkingIndex ++;
    //         }
    //     }

    //     System.out.println(Arrays.toString(nums));

    //     for (int i = 0; i < nums.length; i++) {
    //         // if index + 1 is not equal to value then return that number;

    //         if ((i + 1) != nums[i]) {
    //             return nums[i];
    //         }
    //     }



    //     return -1;
        
    // }

    static void swap(int [] nums, int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}

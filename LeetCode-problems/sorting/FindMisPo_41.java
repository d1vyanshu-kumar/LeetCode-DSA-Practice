/*
 * ELEMENT AT THE CORRECT POSITION.
 * 
 * the target is element and nothing much u have to see.
 */

// https://leetcode.com/problems/first-missing-positive/

// so basically the question is telling u to find the minimum positive  interger

import java.util.Arrays;

public class FindMisPo_41 {

    public static void main(String[] args) {

        int[] nums = {2,1};    // 1


        int ans = findMinPos(nums);

        System.out.println(
            ans
        );

    }

    /*
     * so how can we solve this question: look we need to find the smallest positve
     * number so here is the catch is like we have to check for 1 then 2 , 3,4 to
     * the nth element so like as we can see that it is in the range if [1,n] so we
     * know what to do for this.
     */

    /*
     * look we are going to ignore all the value which is not positve and here is
     * the main point is we checking from the 0th index is it contains 1 then its
     * okay we move on 2 and so on and at the point where the index value is not
     * same as the element we will return the index that one is the lowest positive
     * number
     */
    static int findMinPos(int[] arr) {

        // checking each index but  we need to also keep in mind that we need to ignore zero as well but i guess it is not necessary look i a confused here what if the starting index will be zero and and what if the starting index is 1. 


        int checkingIndex = 0;
        while (checkingIndex < arr.length) {
            // look it consist of zero thats
            int correctIndex = arr[checkingIndex];      // we only get the index here i.e correct index.
            // here keep this thing always in ur mind look we dont need to see the wrong postion for the wrong element just find the correct position and swap that.

            // look here is a lot of confusionk.........Hame jo value hain usai uski sahi jagha pai rakhna hain oky so for e.g  hamne zero wale index value ko pick kiya and abb sunn uo jo element uska correct index pai jo element hoga uskai saath sawp karna hain obviosly uo same correct index pai nhi hain agar uo kudh hain us element pai toh uo swap nhi hoga naah. 


            // simple hain value ko uskai index kai value sai compare kroh.
            // yai hame correct index ka value utha kai dai rha hain.
            if ( arr[checkingIndex] > 0 && arr[checkingIndex] < arr.length && arr[checkingIndex] != arr[correctIndex]) {
                swap(arr, checkingIndex, correctIndex);
            }else{
                checkingIndex ++;
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int index = 1; index < arr.length; index++) {
            if (index != arr[index]) {
                return index;
            }
        }

        if (arr[0] > 0 && arr[0] <= arr.length) {
            return arr[0] + 1;
        }


        return arr.length;
    }


    static void  swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}

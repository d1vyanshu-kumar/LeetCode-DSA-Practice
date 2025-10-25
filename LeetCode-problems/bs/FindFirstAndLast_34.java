import java.util.Arrays;

public class FindFirstAndLast_34 {
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    public static void main(String[] args) {
        // finsind starting and ending positon

        int[] nums = { 4,4,4,4,4, 5,6 };
        int target = 4;

        ans[0] = findIndex(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = findIndex(nums, target, false);
        }
        System.out.println(Arrays.toString(ans));
    }


    static int[] findStartAndLast(int[] nums, int target) {

       // we need to return an array which consist of two thing the starting index and the ending index of that target.

       int [] ans = {-1,-1};          // if there is nothing found then return -1, -1

       // lets find that number then as it is given that given number is in accending formate so lets try this.

       int start = findIndex(nums, target, true);
       int end = findIndex(nums, target, false);

       ans[0] = start;
       ans[1] = end;
       return ans;

    }

    static int findIndex(int [] arr, int target, boolean startingIndex){

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end){
            
            int mid = start + (end - start)/ 2;

            if(target < arr[mid]){

                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                 ans = mid;

                if(startingIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;

    }
}


// look i am going to explain here is what is happened for this question:
/*
 * look what we need to find is the inital and the last index of the array with respect to target.
 * as it is given that the given array is in accending order so lets start by finding the target element by using "BS", and when we are get 
 * that element now here is two possible:
 * 1st one is this one is only one element and if that it will return that index in arr
 * the 2nd one is that this one is middile element and both side there are other element as well if yes then we are going to again apply
 * binary search on  both side until we are not going to find the first array index.and similarly the last index.
 */
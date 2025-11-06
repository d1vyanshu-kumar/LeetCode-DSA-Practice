public class FindMinRSA_154 {

    // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/?envType=problem-list-v2&envId=binary-search

    // Don’t try to find the maximum. Instead, directly search for the minimum.
    public static void main(String[] args) {

        /*
         * Suppose an array of length n sorted in ascending order is rotated between 1
         * and n times.
         * Given the sorted rotated array nums that may contain duplicates, return the
         * minimum element of this array.
         */

        // int nums[] = { 1,1 };
        int nums[] = { 10, 1, 10, 10, 10 };

        System.out.println(findMin(nums));

    }

    // static int findMin(int[] arr) {

    // }

    /*
     * i am thinking that we have to find maximum and the next element is going to
     * our answer but in order to find max we need to write a correct algo cause
     * there is dublicat element as well. find max element index
     */

     
     

    // static int findMax(int[] arr) {

    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;

    //         if ((mid <= arr.length - 2) && arr[mid] > arr[mid + 1]) {

    //             return arr[mid + 1];

    //         } else if (mid == arr.length - 1) {
    //             return arr[0];
    //         } else if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
    //             start++;
    //             end--;
    //         } else if (arr[start] >= arr[mid]) {
    //             end = mid;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }

    //     return -1;
    // }

    // this is my above though but after giving 2hr on this question i relise that this is the wrong way.
     // now I'm going to find minimum directly.


     static int findMin(int [] arr){

        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            
            int mid = start + (end - start) / 2;


            if (arr[mid]  < arr[end]) {
                end = mid;
            }else if(arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end --;      // if arr[mid] === arr[end] maybe the mid is minimum
            }
        }

        return arr[start];
    }

}

class InfiniteArrayBS {

    // look this question is all about finding the number which is target and the
    // main thing is the given arrry have infinite length like we have not any idea
    // about how much size of the array having find the Target in this array.

    /*
     * Basically this question is all about that we haven't idea about the starting
     * and the ending index and not even the arr.length we are not going to use any
     * of this.
     * so look what if we are going to check the array in a chunk wise lets start
     * from index 0 and 1 and start checkinhg the target in between the chunk and if
     * that not found then we are double the size of the array and similarly check
     * in that.
     * now look what is the defination of bs is we are diving the array /2 unitl we
     * are not found the target element so in the end we are going to found the
     * tareget element. thus the time complexity is logn N/2^K = 1 ;
     * here we are doing same thing but insted of dividing we are going to multiply
     * the size of array and starting from 1. and thus it will give the same time
     * complexity. which is logN.
     */

    public static void main(String[] args) {
        // here is the array in Accending sorted array please make sure are checking the
        // given array is sorted or not.

        // so we need to find the starting and ending point and then use Binary search
        // in that chunk for that element.

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int target = 9;

        System.out.println(ans(arr, target));
    }

    // finding the range and here is function for that;

    static int ans(int[] arr, int target) {

        int start = 0;
        int end = 1;

        // here we are assume that the the starting and the ending index of the arr.
        // now here we are going to check that target lies in this or not

        //

        while (target > arr[end]) {
            int newStart = end + 1;
            int newBoxSize = end + (end - start + 1) * 2;

            start = newStart;

            // if (newBoxSize <= arr.length - 1) {
            //     end = newBoxSize;
            // } end stays stuck at some value less than arr.length - 1, while target > arr[end] is still true.

            end = Math.min(newBoxSize, arr.length - 1); // prevent out of bounds. /// i
            // guess we need to use one time here arr.length.
        }

        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
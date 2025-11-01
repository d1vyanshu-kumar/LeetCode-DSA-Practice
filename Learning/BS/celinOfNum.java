public class celinOfNum {

    // what this means is we need to just find the number which is "=", "<" to the
    // Target;
    // and it is given it is that given arr is sorted.

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 8 };

        int target = 7;
        System.out.println(findCelinNum(arr, target));
    }

    static int findCelinNum(int[] arr, int target) {

        // look we are going to try with the binary search idk why but try with that may
        // be this is sorted arr but it is not given this is acc or dec I know how can
        // deal with this shit...

        // look finding the number which is the > or = target;

        // as we know that what binary search means: this means that we are getting
        // closer of target number okay!
        // and in the end if we found that number or not found then return -1, now think
        // but if the number is not found then we have to return its just greater
        // number.

        // so insted of -1, return the very next greater number after the loop is end "i
        // said when loop is end" the start number will be that next greater number
        // cause if the number is greater to that number then we are going to change the
        // end point i mean mid > target then we change end = mid -1; so here the loop
        // is going to break cause we are not find that number so the e<s which is not
        // possible and return start.
        // cause we know that in the end there is only one arr we get where end, start,
        // mid all point to the same number. and if that number is going to greater then
        // target one then end is going to chnage which is mid-1 and this will cuse
        // break the loop and we found the next greater number which is arr[start] okay.

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (arr[mid] > target) {
               end = mid -1;
            } else {
                start = mid +1;
            }

        }

       return arr[start];

    }

}

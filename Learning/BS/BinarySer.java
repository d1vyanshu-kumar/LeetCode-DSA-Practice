public class BinarySer {

    // its simple find the middle element
    // and then change starting and the ending point as per the targer value...

    /*
     * remember this thing worst time complexity k = log base 2 N., N/2^k = 1;
     * and also here is the another thing which you need to keep in mind is this
     * mid + (end - start) / 2. for preventing the out of bound expection
     */
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 54, 6, -12, 33 };

        int target = -12;

        System.out.println(findTarget(arr, target));
    }

    static int findTarget(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int mid = start - (end - start) / 2;

        while (start <= start) {

            if (mid < target) { // right change end point
                end = mid - 1;
            } else if (mid > target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

public class BinarySearch {

    // make sure arr is sorted   // and also you are know that it that the given arr is in accending or decending order  see 1st and last number.
    // its simple find the middle element
    // and then change starting and the ending point as per the targer value...

    /*
     * remember this thing worst time complexity k = log base 2 N., N/2^k = 1;
     * and also here is the another thing which you need to keep in mind is this
     *  mid + (end - start) / 2. for preventing the out of bound expection
     */
    public static void main(String[] args) {
        
        int [] arr = {-12, 1, 2, 3, 4, 6, 33, 54};

        int target = -12;

        System.out.println(findTarget(arr, target));
    }

    static int findTarget(int [] arr, int target){

        int start = 0;
        int end = arr.length -1;
        
        // if you decler the mid here then mid is going to be fixed and it is not going to change and you know this is going to be changed as per the end and start. so dont do this type of stupid but i know this place where i am going to cooked.but i am try to keep this in my mind 😂

        while (start <= end) {

            // and remember that the mid is declered inside the while loop
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) { // right  change end point 
             start = mid + 1;
            }else if ( arr[mid] > target) {
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
    
}

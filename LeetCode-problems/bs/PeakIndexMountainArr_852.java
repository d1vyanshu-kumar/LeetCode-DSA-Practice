
public class PeakIndexMountainArr_852 {

    public static void main(String[] args) {
        
        // given that there is a peak mountain array and i have to found the peak element after which the the element is going to decreased.

        int [] arr = {0,9,10,5,2};

        // so how can we solve this issue?:
        /*
         * look as i am thinking the tareget is whome where the both side of the element is less that the target so i guess from. here we can get some idea through BS
         */

         System.out.println(findTarget(arr));
    }

    static int findTarget(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            
            int mid = start + (end - start)/ 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
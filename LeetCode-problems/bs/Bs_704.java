public class Bs_704 {
    
    public static void main(String[] args) {
        
        int [] nums = {-1,0,3,5,9,12};

        int target = 2;


        System.out.println(findTarget(nums, target));
        
    }

    static int findTarget(int [] arr, int target){

        // this is the classic Bs 
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) { // this is the classic bs
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}

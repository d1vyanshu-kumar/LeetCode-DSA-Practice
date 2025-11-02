public class SearchInsert_35 {
    
    public static void main(String[] args) {
        
        int [] nums = {1,3};

        int target = 2;
        
        System.out.println(findTarget(nums, target));
    }


    static int findTarget(int [] arr, int target){

        // what we need to find the index and is that not found then i need to return the index where it should be if exist

        int start = 0;
        int end = arr.length - 1;      // XXxxxxxOooooo

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return end + 1;
        
    }
}

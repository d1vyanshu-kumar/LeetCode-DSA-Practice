public class Search_Insert_Position35 {

    public static void main(String[] args) {
        int [] nums = {1,3,4,5,6};
        int target = 2;


        System.out.println(findIndex(nums, target));

    }

    static int findIndex(int [] nums, int target){

        /*
         * so what we can do is like  we use a for loop and checking it line by line and if that element is not found then we need to find its next upper value and and return its index
         */

         int count = 0;
         int start = 0;
         int end = nums.length;

         if(start < end){
            for(int i = 0; i< end; i++){
                if (nums[i] == target) {
                    count = i;
                }
            }
         }






        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == target) {
        //         count = i;
        //     }else if (nums[i] != target) {
        //         // here we need to find the next greater element just after the Target and return that.
        //         // i think after cjeckin
        //     }
            
        // }

        // System.out.println(count + "is this is the end");
        // return count;
    }
}

import java.util.ArrayList;

public class LinearSear {
    public static void main(String[] args) {
        int[] nums = { 10, 10 };
        int target = 10;
        System.out.println(findTarget(nums, target, 0));
        System.out.println(findIndexLast(nums, target, nums.length - 1));
        System.out.println(findAllTarget(nums, target, 0, new ArrayList<Integer>()));
        System.out.println(findALlTarget2(nums, target, 0));
    }

    // we need to find the target element in an array! return index

    static int findTarget(int[] arr, int target, int index) {

        // base condition

        if (index + 1 > arr.length) { // ; ) --------- ( ;2
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return findTarget(arr, target, index + 1);
    }

    static int findIndexLast(int[] arr, int target, int index) {

        // base condition
        if (index < 1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return findIndexLast(arr, target, index - 1);

    }

    // How can we return the all the target element like what if if we have more
    // then one target element at diffrent index ;

    // here is the some important concept which must need to revise in future .

    /*
     * key word "STACK"
     * look we can use the array list and store all of the target element index but
     * here is the case one which is easy to understand
     * look we create an array list outside of the function and we can take a use of
     * parameter as well
     * i am talking about a single object gets a different reference...
     */

    static ArrayList<Integer> findAllTarget(int[] arr, int target, int index, ArrayList<Integer> list) {

        // base condition
        // look we have to find all of the target element not the one and get out so we
        // need to execute to the end of array...

        if (index == arr.length) {
            return list;
        }

        // next the logic for each recursion call

        if (arr[index] == target) {
            list.add(index);
        }

        // now we have to execute each recusion func

        return findAllTarget(arr, target, index + 1, list);
    }

    /*
     * key word "STACK". problem ;-)
     * Here is the 2nd way and i think its interesting lets look what we have a
     * condition that we have to initlize array list inside a body how can we do
     * this cause we knew that if we code like this
     * the every recursion call will create a new array list and if we do this then
     * it will give a empty list cause we are getting the output from the very last
     * output i mean imagine how stack work so wht i mean we are going to see the
     * return value from the very first recursion func.
     */

    /*
     * key word "STACK". slution;-)
     * so how we are going to make things done....simple what we are going to do we
     * are pasing the return value from above to below while going up to down
     */

    static ArrayList<Integer> findALlTarget2(int[] nums, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();
        // base condition;

        if (index == nums.length) {
            return list;
        }

        if (nums[index] == target) {
            list.add(index);
        }
        // now here we need to use our mind if we have then...

        // we are going to take the the return value from the last func and store to
        // that place where it is not going to change
        // for this we need to use another arraylist;
        ArrayList<Integer> TakingAnsFromUpper = findALlTarget2(nums, target, index + 1);

        // and now we are going to store upper value to that place where the value is
        // never going to change:
        // its giving me vibe of swapping of number.....Heheheheeee....

        list.addAll(TakingAnsFromUpper);

        return list;

    }

}

// love it....XoxOOooo ;)
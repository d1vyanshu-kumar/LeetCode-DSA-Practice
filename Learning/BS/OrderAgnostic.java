public class OrderAgnostic {

    // look what agnostic means is you know the given arr is sorted but here is
    // the twist we don't know this is sorted in accending or descending order.
    // here is what we can do
    // make a check that if it is acc then we chnage start and end as per that okay
    // and all other stuff will be the same.

    // i am very sure in future i am going to see myslef doing some silly mistake 😭

    public static void main(String[] args) {
        // as of know we only know this is sorted.
        int [] arr = {8,6,2,1,-2};

        int target = -2;
        
        System.out.println(findTarget(arr, target));

    }

    static int findTarget(int [] arr, int target){
        // dont you dare to declare the mid here!

        int start = 0;
        int end = arr.length -1;

        boolean isAsc;

        isAsc = arr[start] < arr[end];

        while (start <= end ) {
            int mid = start + (end - start)/2;

            // now look here before applying condition on start and end as we dont know this is acc or descending

            // here is the common condition:

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                //run ascending condition
                if (arr[mid] > target) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                //run descending cond 
                if (arr[mid] < target) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}

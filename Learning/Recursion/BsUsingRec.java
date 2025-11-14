public class BsUsingRec {

    public static void main(String[] args) {

        // we have to find the target using recursion and U know what is the Bs is
        // look if we are going to use the normal like linear recursion as we know that
        // the it will call the same func many time so in this example we are going to
        // see how efficient and how the divide and conq work
        /*
         * 
         * we we need to compar with the middle element and if the moddle element is not
         * our answer then
         * 
         * In genrall what we need to do just divide the arr unitl we are not getting
         * the target and as i am sying divide what that mean? this mean that we are
         * chinging start and end of the array continously okay through out the process
         *
         * here is the genrall way in the mathmatical formate:
         * 
         * f(bs) = O(1) + f(bs/2)
         * 
         * O(1) means we are just comparing with the target element
         * 
         * and in reucrsion this is the very important point is that if u retun
         * fun(left) + func(right)
         * so like when the func left is entirely finished or return only then
         * func(right) will be executed
         * 
         * and dont forget stack overflow..... if u go up using stair the u need to use same stairs to come back down.
         * 
         * now here we go:
         */

         int [] arr = {1,2,3,4,5,5,6,7,9};

         int target = 1;
         

         System.out.println(Bs(arr, target, 0, arr.length - 1));

    }

    static int Bs(int [] arr, int target, int start, int end){
        // we need to  return integer okay 
        // and as we knew bs means change on the arry length on every step if we ain't got answer what the thing same is middle
        // the thing which remain same is need to put for the body!

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (start > end) {
            return -1;
        }
        
        if (arr[mid] > target) {
            // i forget to mentioned this is sorted in acc order okay

            return Bs(arr,target, start, end -1 );
        }else{
            return Bs(arr,target, mid + 1, end);
        }
    }
}

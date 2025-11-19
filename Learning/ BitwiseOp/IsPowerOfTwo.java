public class IsPowerOfTwo {

    /*
     * you need to tell me weather the given number is power of 2 or not.
     */
    public static void main(String[] args) {
        /*
         * how can we solve this as we know so far for the even or odd we have to see
         * the right most number and the for the + or -ve we are seeing the left most,
         * and we can create negative by two step first neg and + 1
         * but here we have to conform the power of 2
         */

         // n = 8 = 2^3 = 1000 = 111 + 1 => 111 = n-1 
         // n & n-1 == 0 this is power of twp

         int n = 6;

         if ((n & (n-1)) == 0) {
            System.out.println(" this is a power of 2");
         }else{
            System.out.println("damn!!");
         }


         System.out.println(Integer.toBinaryString(16));


    }
}

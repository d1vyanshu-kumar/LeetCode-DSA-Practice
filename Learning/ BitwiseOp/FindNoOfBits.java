/*
 * look what we need to find the number of bits in a binary
 */
public class FindNoOfBits {

    /*
     * log4 base 2 = x => 4 =  2^x; we know what this mean how many times 2 is multiply itself to reach the target 4
     * 
     * now look here 4 = 100; 2^2  = 4 ans = 2 + 1 = 3;
     * 8 = 1000 = 2^3 = ans = 3 + 1 = 4; 
     */

     /*
      * this is a very important formula: (logNumber/ log base) + 1
      */
    public static void main(String[] args) {

        int A = 34567;
        int B = 10;
        
        int ans = (int)(Math.log(A)/ Math.log(B)) + 1;

        System.out.println( ans);
    }
}

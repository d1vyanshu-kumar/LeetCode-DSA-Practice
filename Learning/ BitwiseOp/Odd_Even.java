// every thing works in 0 and 1 inside no need to assume that cause it is real...
public class Odd_Even {

    public static void main(String[] args) {

        /*
         * in binary basically we are going to identify thw number is odd or even by its
         * LSB(least or right)
         * look this is how u are going to check this logically and will make sense:
         * 
         * look even + odd = odd and even + even = even and and add 1 with even make it
         * odd
         * and adding even + 0 = even...
         * 
         */

        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(3));

        
        

        System.out.println(iseven(3));
        System.out.println(iseven(21));

    }

    static boolean iseven(int n) {
        
        // we know that if we are going to and  1 with that number then it will give that number okay.

        if ((n & 1) == 1) {
            return false;
        }
        
        return true;
    }
}

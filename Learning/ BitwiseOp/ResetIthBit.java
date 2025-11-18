public class ResetIthBit {

    // what we need to do is we have to find the ith bit and reset that i mean if
    // that is zero convert that into one and if that one convert that into zero..
    // just reset that.

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(10));

        System.out.println(findBit(10, 4));

    }

    /*
     * lets take an example and 10 : 1010
     * and we need to find the 4th bit. how can we do that
     * 1010 & 0001000 this will give us ith bit.
     * and what we call 0001000 this is known as MASK and we have to make that.
     * look its simple what we can do is left shift of "1" by (n-1) for example for
     * if we want 4th bit then i am going to left shift 1 by 3
     * which is 1000 and then we are going to "&" that with that number and we can
     * get that ith bit...
     */

    static int findBit(int n, int bit) {

        int MASK = 1 << (bit - 1);

        return (n & MASK) != 0 ? 0: 1;

    }
}

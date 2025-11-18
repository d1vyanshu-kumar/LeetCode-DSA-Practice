public class FindIthBit {

    // find the Ith bit of a number

    /*
     * how can we find the ith bit suppose we have to find 4th bit is it set or
     * clear
     *
     * find the 3rd bit in 10...
     */

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(10));

        System.out.println(findBit(10, 1));

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

        return (n & MASK) != 0 ? 1 : 0;

    }
}

/*
 * 1010 (10)
 * & 0100 (mask for 3rd bit)
 * = 0000 → result = 0
 *
 *
 * If you want the answer as just 0 or 1 (like “bit is clear” = 0, “bit is set”
 * = 1), you need to convert the result.
 *
 * (n & MASK) != 0 checks whether the result is non-zero.
 *
 * The ternary operator ? 1 : 0 then forces it into exactly 1 or 0.
 */
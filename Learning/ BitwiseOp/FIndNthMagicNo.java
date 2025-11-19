/*
 * lets see what is the magic number first?
 * 
 * write 1 to nth in binary and take the addition of power of 5.
 * e.g 1 and multiply each but with 5^i i is from one to n, 2 = 010 mutiply with 0 * 5^1 + 5^1 and so on
 */

public class FIndNthMagicNo {

    public static void main(String[] args) {

        System.out.println(findMagicNo(6));

    }

    static int findMagicNo(int n) {
        // what we are going to is n & 1 give me the right most element and after that we need to do right shift  cause we need to ignore after getting the right most elemen.
        // we are going to multiply with 5^i; i = 1 to n; 
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last  = (n & 1);   // gettting the last element 
            n = n >> 1;    // after getting the last element i am chaning n  to its next bit
            ans += last * base; // we are going to add that after multiplying the with 5^i
            base = base * 5;// ans the we are going to change the power if 5
        }

        return ans;
    }
}

/*
 * we need to find a power of b?
 *
 */
/*
 * so here is how we are going to solve this:
 * 
 * for e.g: 3^6 = 3^110 = 3 ^4 * 3^2 = 3^6 okay...
 * now look we need to ignore zero bits and and each time multiply with base  to ans and after that base * base the we need to move on left or ignoring right one  by right shif
 * 
 * 3^2^2⋅3^2^1
 */

/*
 * 
 13 = 1101₂ = 2^3 + 2^2 + 2^0
So mathematically:
3^13 = 3^(2^3) ⋅ 3^(2^2) ⋅ 3^(2^0)
    = 3^8 ⋅ 3^4 ⋅ 3^1
 */


 // this is complicated man!!!!

public class FindApowerB {

    public static void main(String[] args) {

        int ans = 1;
        int base = 3;
        int power = 6;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans = ans * base;
            }

            base *= base;

            power = power >> 1;

        }

        System.out.println(ans);
    }

}

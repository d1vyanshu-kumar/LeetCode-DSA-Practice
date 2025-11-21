public class FindXor0_A {

    // this question is about u need to find xor of from zero to a
    // xor till 7 = xor till 6 and then xor with 7;

    // you need to find patterns:

    /*
     * if a %4 = 0; a
     * 
     * a % 4 = 1; 1
     * 
     * a % 4 = 2; a+1
     * 
     * a % 4 = 3; 0
     */

    /*
     * now the question is how u can find xor in between ranges 0 - c above method
     * now if we have to find from a to c the we do this;
     * ( 0 to c ) xor (0 to a -1); simple
     */
    public static void main(String[] args) {

        int a = 3;
        int b  = 9;

        int ans = Xor(b) ^ Xor(a-1);
        System.out.println( ans);
    }

    // this gives zero to a;

    static int Xor(int a){

        if (a % 4 == 0) {
            return a; 
        }
        if (a % 4 == 1) {
            return 1; 
        }if (a % 4 == 2) {
            return a+1; 
        }


        return 0;


    }
}

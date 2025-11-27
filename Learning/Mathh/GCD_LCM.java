public class GCD_LCM {

    public static void main(String[] args) {

        System.out.println(find_GCD(8, 24));
        System.out.println(find_LCM(8, 24));
    }

    /*
     * by ecludes therom we know how can we get the GCD: GCD(a,b) = GCD((b%a), a)'
     * recursion!!!
     */

    static int find_GCD(int a, int b) {

        if (a == 0) {
            return b;
        }

        return find_GCD((b % a), a);
    }

    /*
     * checkout notion,
     * here is the formula : LCM(a,b) = (a*b)/ GCD(a,b)
     */

    static int find_LCM(int a, int b){

        return (a*b)/find_GCD(a, b);
    }

}
public class FindFactorial {
    public static void main(String[] args) {

        // simple we have to find the factorial of a number.

        int n = 5;

        System.out.println(findFac(n));
    }

    static int findFac(int n) {

        // base condition; multiply anything with zero will result will be zero!

        if (n == 1) {
            return 1;
        }

        return n * findFac(n-1);

    }
}

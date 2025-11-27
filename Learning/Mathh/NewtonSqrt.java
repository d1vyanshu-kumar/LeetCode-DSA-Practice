public class NewtonSqrt {

    /*
     * newton rahpson formula:
     * root(sqrt(N)) = (X + N / X) / 2; X is the assume sqrt root
     * error = |root - X|
     */

    public static void main(String[] args) {

        int n = 40;

        System.out.println(
            findSqt(n)
        );

    }

    static double findSqt(double n) {

        double x = n; // x is the expected root and the inital value define to n;

        double root;

        while (true) {

            root = 0.5 * (x + n / x);

            // we have to minimie the error;

            if (Math.abs(root - x) < 0.5) { // minimise the error
                break;
            }

            x = root;
        }

        return root;

    }
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Factor {

    public static void main(String[] args) {
        /*
         * we have to find the factor of a given number.
         */

        int no = 36;

        System.out.println(findFacto3(no));

    }

    static ArrayList<Integer> findFactor(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        return list;
    }

    // here is the optmisied way to solve this

    // look 20 / 2 = 10 and 10 * 2 so we have both now 2 and 10, we can prevent the
    // repated thing okay, we need to go up to root of that given number.

    static ArrayList<Integer> findFacto2(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                if (n / i == i) {
                    list.add(i);
                } else {
                    list.add(i);
                    list.add(n / i);
                }
            }

        }

        return list;
    }

    // static ArrayList<Integer> findFacto3(int n) {
    // ArrayList<Integer> list = new ArrayList<>();

    // // First collect all small factors
    // for (int i = 1; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // list.add(i);
    // }
    // }

    // // Then collect the paired large factors (in reverse order)
    // for (int i = (int) Math.sqrt(n); i >= 1; i--) {
    // if (n % i == 0 && n / i != i) {
    // list.add(n / i);
    // }
    // }

    // return list;
    // }

    static ArrayList<Integer> findFacto3(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        // First collect all small factors
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                System.out.println("Added small factor: " + i + " → Current list: " + list);
            }
        }

        // Then collect the paired large factors (in reverse order)
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {     // we are using i is that cause we want number from accending order...
            if (n % i == 0 && n / i != i) {
                list.add(n / i);
                System.out.println("Added large factor: " + (n / i) + " → Current list: " + list);
            }
        }

        return list;
    }

}

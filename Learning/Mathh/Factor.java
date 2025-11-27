import java.util.ArrayList;

public class Factor {

    public static void main(String[] args) {
        /*
         * we have to find the factor of a given number.
         */

        int no = 36;

        System.out.println(findFacto2(no));
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

            if (n / i == i) {
                list.add(i);
            } else {
                list.add(i);
                list.add(n / i);
            }
        }

        return list;
    }
}

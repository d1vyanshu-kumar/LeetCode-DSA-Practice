public class oneToN {

    public static void main(String[] args) {
        // printNo(10);

        printRev(10);
    }

    // we have to print a a number from n to one

    static void printNo(int n) {

        // first we need to write a base condition okay!!!
        if (n == 0) {
            return;
        }

        // and after that we want to print the number before function goes inside a
        // stack.

        System.out.println(n); // Gata only!!!

        // then we just need to callback the func

        printNo(n - 1);

    }

    // now lets see how can we print In reverse order:

    static void printRev(int n) {

        // we need to write a base condition for the entire code:

        if (n == 0) {
            return;
        }

        // as we want to reverse that so we need to go to the end of the call stack and
        // then we need to print so how can we got the end func from the call stack just
        // by calling the func.

        printRev(n - 1);

        // after getting the last func call then we are going to print from the back....

        System.out.println(n);
    }


}

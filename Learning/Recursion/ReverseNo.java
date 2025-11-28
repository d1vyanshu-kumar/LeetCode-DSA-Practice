public class ReverseNo {
    public static void main(String[] args) {
        // we need to reverse the given Number,

        int n = 1012;

        findRev(n);
        System.out.println();
        System.out.println(findRev2(n));
        System.out.println(palindrome(n));
    }

    static void findRev(int n) {

        if (n == 0) {
            return;
        }

        int getDigit = n % 10;

        System.out.print(getDigit);

        findRev(n / 10);

    }

    static int findRev2(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }

    static int helper(int n, int digit) {
        if (n % 10 == 1) {
            return n;
        }

        int rem = n % 10;

        return rem * (int) Math.pow(10, digit - 1) + helper(n / 10, digit - 1);

    }

    static boolean palindrome(int n) {
        return n == findRev2(n);
    }
}

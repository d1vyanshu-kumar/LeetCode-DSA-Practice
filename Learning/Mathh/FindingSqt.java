public class FindingSqt {

    // how to find the square root of a number....
    // 36 to 6

    // looks i think we deal this type of question here it is how it will look
    // familer to us

    /*
     * just by starting from 2 like 2 * 2 is this equal to target and of not then
     * move to next and so on....
     * look we can go through this but as we aRe seeing that we have to search thing
     * from 2 to that number
     * so its a sorted array type and we have to find target and we know in this
     * case we are going to use BINARY SEARCH
     */

    public static void main(String[] args) {

        int sqt = 46;
        int dec = 3;

        double ans = findSqt(sqt, dec);
        System.out.println(ans);
    }

    static double findSqt(int n, int p) {

        int s = 0;
        int e = n;
        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if ((m * m) == n) {

                return m;
            }

            if ((m * m) > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += inc;
            }

            root -= inc;

            inc /= 10;
        }

        return root;

        // int i = 2;
        // int start = 2;
        // int end = n;
        // int ans = 0;

        // while (i < n) {
        // int mid = start + (end - start) / 2;

        // if (mid * mid == n) {
        // ans = mid;
        // }

        // if ((mid * mid) > n) {
        // end = mid - 1;
        // } else {
        // start = mid + 1;
        // }

        // i++;
        // }

        // return ans;

    }
}

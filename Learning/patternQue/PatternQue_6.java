public class PatternQue_6 {
    public static void main(String[] args) {
        // here is what pattern look like:

        // 1
        // 2 1 2
        // 1

        finPattern(10);

    }

    static void finPattern(int n) {

        for (int row = 1; row <= (2 * n - 1); row++) {

            // step 2
            if (row > n) {
                // let see for the space first;

                for (int space = 0; space <= (row - n); space++) {
                    System.out.print("  ");
                }

                // for elements now

                int count = (2 * n) - row; // how many numbers to print in this row

                for (int left = count; left >= 1; left--) {
                    System.out.print(left + " ");
                }

                for (int right = 2; right <= count; right++) {
                    System.out.print(right + " ");
                }

                System.out.println();
            } else {

                // step 1
                // this loop for space;
                for (int space = n - row; space >= 0; space--) {
                    System.out.print("  ");
                }

                // loop is for col element and look there is two part, and this one if for the
                // left one;
                for (int left = row; left >= 1; left--) {
                    System.out.print(left + " ");
                }

                for (int col = 2; col <= row; col++) {
                    System.out.print(col + " ");
                }

                System.out.println();
            }

        }

    }
}

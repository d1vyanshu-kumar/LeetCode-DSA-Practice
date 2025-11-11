public class PatternQue_3 {

    // here is what question is look like:

    // *
    // * *
    // * * *
    // * *
    // *

    // 5 and 3
    // total number of rows

    public static void main(String[] args) {
        findSoln(3);
    }

    static void findSoln(int n) {

        for (int i = 1; i <= ((2 * n) - 1); i++) {
            // here i am get the clue that we need to change the col and this one is
            // diffrent after the i = n;

            int col = i > n ? (2 * n - 1) - (i -1): i;

            
            for (int c = 1; c <= col; c++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}

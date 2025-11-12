public class PatternQue_5 {
    public static void main(String[] args) {
        // here is what the output is look like:

        // 1
        // 2 1 2

        findPattern(20);

    }

    static void findPattern(int n) {

        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

             System.out.println();
        }
        

    }
}

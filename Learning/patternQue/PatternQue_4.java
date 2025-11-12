public class PatternQue_4 {

    public static void main(String[] args) {
        
        // look this is what our que is look like:

        /*
         *       *
         *     *   *
         *       *
         *
         */

         findPattern(50);

    }

    static void findPattern(int n){

        // rows = 2n - 1

        for (int i = 0; i < 2*n ; i++) {

            int totalCol = i > n ? ( 2 * n - i ): i;
            int noOfSpace = n - totalCol;

            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <totalCol ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
}

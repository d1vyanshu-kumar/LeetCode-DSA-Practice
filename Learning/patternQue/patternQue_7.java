public class patternQue_7 {

    public static void main(String[] args) {

        // 2 2 2
        // 2 1 2
        // 2 2 2

        findPattern(9);

    }

    static void findPattern(int n) {

        n = (2*n );
        for(int rows = 0; rows <= n ; rows++){

            for(int col = 0; col <= n; col++){
                int atEveryIndex = Math.min(Math.min(rows, col), Math.min(n- rows, n- col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

}

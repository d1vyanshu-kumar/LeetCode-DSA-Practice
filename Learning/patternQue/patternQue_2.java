public class patternQue_2 {

    public static void main(String[] args) {
        // here is how the question is look like:

        /*
         * 1
         * 1 2
         * 1 2 3
         */

         solnPatten(5);

    }

    static void solnPatten(int n){
        
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

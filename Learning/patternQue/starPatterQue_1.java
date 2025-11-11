public class starPatterQue_1 {

    public static void main(String[] args) {
        
        /*
         * look this is question is look iike
         */


        //  *
        //  * *
        //  * * *

        // look i am not gonna lie i just have one clue that the question is solved like 2d matrix
        // lets see if i solve this question or not

        solnPattern(5);

    }

    static void solnPattern(int n){
        for(int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
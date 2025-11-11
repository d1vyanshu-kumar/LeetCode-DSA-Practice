public class starpatternQue_1_1 {
    
    public static void main(String[] args) {
        // here  is  what the ques is look like

        // * * *
        // * *
        // *

        patternQue(5);

    }

    static void patternQue(int n){
        
        for(int i = 0; i < n; i++){
            for(int j = n - i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

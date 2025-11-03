public class SearchIn2D_740 {
    public static void main(String[] args) {
        /*
         * Integers in each row are sorted in ascending from left to right.
         * Integers in each column are sorted in ascending from top to bottom.
         */


         // lets see how can i sove this look sorted means binary search okay. so look just we need to eleminate the col and rows so we can get closer to the target element as we know this is what bs is known for oka!

         int [][] matrix = 
         {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
         };

         int target = 0;


         boolean ans = findTareget(matrix, target);
         System.out.println(ans);
    }


    static boolean findTareget(int [][] matrix, int target){

        int row = 0;
        int col = matrix[0].length -1;

        while (row < matrix.length && col >= 0) {
            
            if (matrix[row][col] == target) {
                return true;
            }

            if(matrix[row][col] > target){
                col --;
            }else{
                row ++;
            }
        }
        return false;
    }
}

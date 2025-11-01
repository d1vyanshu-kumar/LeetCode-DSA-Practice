import java.util.Arrays;

public class findTargetIn2dArray {
 
    public static void main(String[] args) {
        
        int [][] arr = 

        {
            {1,2,3,4},
            {89,23,32,11},
            {24,21,10}
        };

        int target = 10;

        System.out.println(Arrays.toString(findElement(arr, target)));

        // we want answer in this formate [r,c]
    }

    static int [] findElement(int [][] arr, int target){

        for(int row = 0; row< arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                
                if (arr[row][col] == target) {

                    return new int[] {row, col};
                }
            }
        }

        return null;
    }
}

import java.util.Arrays;

public class RE_TwoDimMetrix {

    public static void main(String[] args) {
        int[][] matrix =

                {
                        // { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }
                        {1},{3}
                };

        int target = 5;

        int [] ans = isTaregetAvl(matrix, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }

            if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }

    static int[] isTaregetAvl(int[][] matrix, int target) {

        /*
         * look this is the matrix and it is given that this is sorted and look the
         * sorted means the the rows are greater then the previous one..
         */

        int rows = matrix.length;
        int cols = matrix[0].length; // we need to check that the col is exist okay.

        // for special case cause it is not matrix until two rows is not given
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        // now we need to run the code until unless we cant get the two rows

        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cMid = cols / 2;
        // we want two rows in. the very end where we are going to use the Bs.
        // we are going to execute the loop in such a way so we are going to get two
        // rows in the end there is nothing complicated here.
        // we are just excuting the loop and nothing more then that its important, here
        // u are going to make mistake.
        while (rStart <= (rEnd - 2)) {

            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }

            // now here are going to execute two conditions here:

            if (matrix[mid][cMid] > target) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }

        /// in the end we are getting two Rows with the multiple cases:

        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }

        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        if (matrix[rStart][cMid] > target) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        } else if(matrix[rStart][cMid] < target && target <= matrix[rStart][cols-1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        if (matrix[rStart + 1][cMid] > target) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }else{
            return binarySearch(matrix, rStart + 1, cMid + 1, cols-1, target);
        }
        

    }

}
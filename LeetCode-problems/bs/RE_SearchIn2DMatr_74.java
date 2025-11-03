public class RE_SearchIn2DMatr_74 {
        public static void main(String[] args) {
                int[][] matrix =

                                {
                                                { 1, 3, 5, 7 },
                                                { 10, 11, 16, 20 },
                                                { 23, 30, 34, 60 }
                                };

                int target = 23;

                /*
                 * Each row is sorted in non-decreasing order.
                 * The first integer of each row is greater than the last integer of the
                 * previous row.
                 */

                 boolean ans = isTargetAvl(matrix, target);
                 System.out.println(ans);

        }

        static boolean isTargetAvl(int[][] matrix, int target) {
                // so its a sorted matrix and we have to solve this in a log(m * n)

                // here is what we are going to do we are using bs and look what i am going to
                // do is i am elemenating rows and col like this I take first row and the last
                // rows and find the middle rows and after getting the middle rows we are
                // checking the middle col and if the that middle col element is the target then
                // return that other wise you elemenate the rows lets do this first and then we
                // will talk later.

                int rows = matrix.length;
                int col = matrix[0].length;
                int mCol = col / 2;

                // case when row is 1
                if (rows == 1) {
                        // look this is the special cases when row is 1 and now here we are using the
                        // binary search and we are going to find the target here

                       return binarySearch(matrix, 0, 0, col - 1, target);
                }

                // now from here we need to be very carefully cause look in the end we want two
                // rows exacty where we are going to search in that.
                // so using while loop in such a way that will executed in such a way so that in
                // the end we will get only two rows.

                int rStart = 0;
                int rEnd = matrix.length - 1;

                while (rStart <= rEnd - 2) {

                        int mid = rStart + (rEnd - rStart) / 2;

                        if (matrix[mid][mCol] == target) {
                                return true;
                        }

                        if (matrix[mid][mCol] < target) {
                                rStart = mid;
                        } else {
                                rEnd = mid;
                        }

                }

                // now in the end we are getting the last two rows and here we need to find the
                // target and we need to write 4 condition here.

                if (matrix[rStart][mCol] == target) {
                        return true;
                }

                if (matrix[rStart][mCol] > target) {
                        return binarySearch(matrix, rStart, 0, mCol -1, target);
                } else if (matrix[rStart][mCol] < target && target <= matrix[rStart][col - 1]) {
                        return binarySearch(matrix, rStart, mCol + 1, col -1, target);
                }

                if (matrix[rStart + 1][mCol] == target) {
                        return true;
                }

                if (matrix[rStart + 1][mCol] > target) {
                        return binarySearch(matrix, rStart + 1, 0, mCol - 1, target);
                } else {
                        return binarySearch(matrix, rStart + 1, mCol + 1, col - 1, target);
                }

        }

        // look what parameter this function include: the matrix which I am going to
        // search and then the rows and that starting index and the last Index and the
        // last one which is the target.

        static boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

                while (cStart <= cEnd) {
                        int mid = cStart + (cEnd - cStart) / 2;

                        if (matrix[row][mid] == target) {
                                return true;
                        }

                        if (matrix[row][mid] > target) {
                                cEnd = mid - 1;
                        } else {
                                cStart = mid + 1;
                        }
                }

                return false;
        }

}

/*
 * 🟦 Example 1: Row-and-Column Sorted (but NOT fully sorted)
 * Code
 * 1 3 5
 * 2 4 7
 * 6 8 9
 * ✅ Each row is sorted left → right
 * 
 * Row 1: [1,3,5]
 * 
 * Row 2: [2,4,7]
 * 
 * Row 3: [6,8,9]
 * 
 * ✅ Each column is sorted top → bottom
 * 
 * Col 1: [1,2,6]
 * 
 * Col 2: [3,4,8]
 * 
 * Col 3: [5,7,9]
 * 
 * ❌ But if you flatten row by row: [1,3,5,2,4,7,6,8,9] → not globally sorted
 * (notice 5 → 2 breaks the order).
 * 
 * This is the classic row-and-column sorted matrix.
 * 
 * 🟩 Example 2: Fully Sorted (Row-major Sorted)
 * Code
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * ✅ Each row is sorted left → right
 * 
 * ✅ Each column is sorted top → bottom
 * 
 * ✅ Flatten row by row: [1,2,3,4,5,6,7,8,9] → globally sorted
 */
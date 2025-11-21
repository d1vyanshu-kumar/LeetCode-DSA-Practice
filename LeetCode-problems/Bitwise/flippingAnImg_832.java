import java.util.Arrays;

public class flippingAnImg_832 {

    // https://leetcode.com/problems/flipping-an-image/description/

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        System.out.println(Arrays.deepToString(findInvtImage(image)));
    }

    static int[][] findInvtImage(int [][] image){
        for (int[] row : image) {
            int n = row.length;
            for (int i = 0; i < (n + 1) / 2; i++) {
                // swap and invert both ends
                int temp = row[i] ^ 1;
                row[i] = row[n - i - 1] ^ 1;
                row[n - i - 1] = temp;
            }
        }
        return image;
    }
}

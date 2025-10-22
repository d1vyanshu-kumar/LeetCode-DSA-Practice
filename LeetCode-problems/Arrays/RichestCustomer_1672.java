public class RichestCustomer_1672 {

    // what we need to do is to find the maximum sum of elements in a rows consists.

    public static void main(String[] args) {
        int[][] arr = {

                { 1, 2, 3 },
                { 4, 6 },
                { 1, 0, 2 }

        };

        System.out.println(maxSum(arr));
    }

    // look we have to find the maximum so of elements in each row so what we could
    // do
    // well i am thinking itrate on each rows element and then sum it and store that
    // in a var and compare with the other rows elemtnt and update that vat
    // according to rows.

    static int maxSum(int[][] arr) {
        int maxRowsCount = Integer.MIN_VALUE; // gonna compare with this and update this as per the sum of rows.
        int element = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // now look Up to here we can get access of the elements of the each rows element and now what we can do?
                // i guess we  need to do sum of each rows element 

                //  int element = arr[row][col];

                // element += element;   // this is wrong way cause it is not accessable out side of the loop
                // now look element is the one who consist the sum of  concequitve row.
                // keep in mind this for this next time.
                // we only want some of each row one by one

                element += arr[row][col]; // from here we are getting the sum  of rows not each rows but the entire row how can we prevent that?


            }

            // look i guess evevry thing this looks good above so far. from here we need to change the value of element to zero again
            // update the max count...

            if (element > maxRowsCount) {
                maxRowsCount = element;
            }

            element = 0; // lovely 😚

        }


        return maxRowsCount;
    }
}

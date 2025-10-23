public class FloorOfNum {

    public static void main(String[] args) {
        // look what we need to do is find the largest number which is less then or
        // equal to that number.

        // int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9 };

        int [] arr = {8,6,5,3,2,1};

        int target = 7;

        System.out.println(findFloorNum(arr, target));
    }

    static int findFloorNum(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // look here as we kow this is given that this is accending order so here we go:

        boolean isAcc;

        if (arr[start] < arr[end]) {
            isAcc = true;
        } else {
            isAcc = false;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (isAcc) {
                // accending wala if else
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;   
                }
            } else {
                // decsending wala if else

                if (arr[mid] > target) {
                    start = mid + 1;    // target choota h toh start move karega yai case 8 pai leke kroh for descending order. bohot important hain....
                }else{

                    end = mid -1;
                }
            }
        }

        return isAcc ? arr[end] : arr[start];       // target choota h toh start move karega yai case 8 pai leke kroh for descending order. bohot important hain....
    }

}

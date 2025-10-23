public class SmallestLett_744 {
    public static void main(String[] args) {

        // look we need to find the letter which is greater then target value lexo...
        // and if we are not found then return arr[0];

        // and it is given that it is sorted in the accending order.

        char[] arr = {'e','e','e','e','e','e','n','n','n','n' };
        char target = 'e';

        System.out.println(findSmallestLetter(arr, target));
    }

    static char findSmallestLetter(char[] arr, char target) {

        int start = 0;
        int end = arr.length - 1;

        if (target >= arr[end]) {
            return arr[start];
        }

        while (start <= end) {

            // find the char which is greater then target

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] <= target) {
                start = mid + 1;
            }
        }

        return arr[start];
    }
}

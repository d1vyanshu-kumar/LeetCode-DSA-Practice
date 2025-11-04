import java.util.Arrays;

public class missingNo_268 {
    // we have to find missing number in the given range [0, n]

    public static void main(String[] args) {
        int [] nums = {0,1};

        // System.out.println(findMissingNO(nums));

        // findMissingNO(nums);

        // System.out.println(Arrays.toString(nums));
        System.out.println(cyclicSorting(nums));
    }

    static int cyclicSorting(int[] arr) {

        int checking = 0;

        while (checking < arr.length) {

            int correct = arr[checking];

            if (arr[checking] < arr.length && arr[checking] != arr[correct]) {
                swap(arr, checking, correct);
            } else {
                checking++;
            }
        }

        for(int index = 0; index < arr.length;index++){
            if (arr[index] != index) {
                return index;
            }
        }


        return arr.length;
    }

    static void swap(int[] arr, int firstElementIndex, int secondElementIndex) {
        int temp = arr[firstElementIndex];
        arr[firstElementIndex] = arr[secondElementIndex];
        arr[secondElementIndex] = temp;
    }
}



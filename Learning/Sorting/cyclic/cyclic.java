import java.util.Arrays;

/*
 * here is rec pattern and this line is very important:
 * given array is sorted and range will be from [1, n]; and u know, u could use brain here
 * time complexity O(n);
 */

public class cyclic {

    public static void main(String[] args) {

        int[] arr = { 3, 2, 5, 1, 4, 0 };

        cyclicSorting(arr);

        System.out.println(Arrays.toString(arr));

    }

    // given the range is from [1,n] and unique integer.

    static void cyclicSorting(int[] arr) {

        int checking = 0;

        while (checking < arr.length) {

            int correct = arr[checking];

            if (arr[checking] != arr[correct]) {
                swap(arr, checking, correct);
            } else {
                checking++;
            }
        }
    }

    static void swap(int[] arr, int firstElementIndex, int secondElementIndex) {
        int temp = arr[firstElementIndex];
        arr[firstElementIndex] = arr[secondElementIndex];
        arr[secondElementIndex] = temp;
    }
}

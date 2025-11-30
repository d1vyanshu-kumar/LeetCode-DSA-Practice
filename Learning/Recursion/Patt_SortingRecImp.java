import java.util.Arrays;

public class Patt_SortingRecImp {
    /*
     * here is what the question is all about:
     * ----------
     * * * (3)
     * * (2)
     * (1)
     * ----------
     */
    public static void main(String[] args) {

        // how can we shows this pattern with recursion.... :(

        triangle(4, 0);

        int arr[] = {1, 4, 5, 8, 6};
        // bubbleSort(arr, arr.length - 1, 0);
        // System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle(int r, int c) {
        // starting from the row 4 and column less then row and starting column from
        // zero

        // base condition: we are starting from row at max so if row == 0 return

        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    static void bubbleSort(int[] arr, int r, int c) {
        // comparing adjacent element and get the bigger at the end in each rec call

        if (r == 0) {
            return;
        }

        // int arr[] = {2,1,4,5,6};
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                // swap

                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            bubbleSort(arr, r, c + 1);
        } else {
            bubbleSort(arr, r - 1, 0);
        }
    }

    static void selectionSort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        //        int arr[] = {1, 4, 5, 8, 6};
        if (c < r) {
            if (arr[c] > arr[max]) {
                selectionSort(arr, r, c + 1, c);
            } else {
                selectionSort(arr, r, c + 1, max);
            }
        } else {
            // when inner loop finishes, swap max with last element
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            // move to next pass
            selectionSort(arr, r - 1, 0, 0);
        }
    }

}

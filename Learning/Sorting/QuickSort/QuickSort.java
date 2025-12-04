import java.util.Arrays;

public class QuickSort {

    /*
     * Quick Sort is a method of sorting an array in a way that:
     * We choose one element from the array, called the pivot.
     * We rearrange the array so that all elements smaller than the pivot go to its
     * left,
     * and all elements greater than the pivot go to its right.
     * After this step, the pivot is now in its correct position in the sorted
     * array.
     * We then repeat the same process (recursively) on the left and right parts
     * until the entire array is sorted.
     * 
     * best time complexity is when we are took pivot element a middle element: logN
     * worst when we take the very last element: N^2
     */

    public static void main(String[] args) {

        int [] arr = {2,1,4,3,5,7};

        sort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    // we are not going to return anything cause we are going to modify the original
    // array unlike the merge sorting....

    // Quick Sort works by partitioning the array around a pivot.
    // To do this, we need variables:
    // * Two variables for swapping elements when they are out of place.
    // * Two variables to mark the current boundaries (start and end index).
    // * One variable for the pivot itself.

    // In each recursive call:
    // * The pivot is chosen (often the first or last element).
    // * We rearrange elements so that smaller ones go to the left of the pivot,
    // and larger ones go to the right.
    // * The pivot is now in its correct position.
    // * Then we recursively repeat the process on the left and right subarrays.
    //
    // Notice: the boundary variables (start and end) change in each recursive call,
    // because we are now working on smaller subarrays.

    static void sort(int [] arr, int start, int end){

         if (start >= end) return;

        // we are going to take mid as pivot
        // remember the the smaller element to left and greater element on right

        int first = start;
        int last = end;
        int mid = first + (last - first) / 2;
        int pivot = arr[mid];

        // like a base cond
        while (first <= last) {
            
            while (arr[first] < pivot) {
                first++;
            }

            while (arr[last] > pivot) {
                last--;
            }

            // and now if the violation found then;

            //swapping
            // remember the code is body will complete before going to up again....
            if (first <= last) {
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }

            // now the pivot element is on its right position....
            // check for right and left subArray...
            // don't think much just feel....

            sort(arr, start, last);
            sort(arr, first, end);
        }
    }
}
import java.util.Arrays;

/*
* Keyword "STACK"
*what is the merge sort?
* its a three step process by which u can sort the array
* 1. divide the unsorted arr into two parts(left and right) "RECURSION"
* 2. sort each part of the arr using binary search
* 3.  finally merge sorted part
*/

/*
 * divide the array until we are not getting the single element...."base condition"
 *  and then we are going to compare the left one and right one array element and the thing is 
 *  in each recursion call we are not pointing to the same array object, its very obvious that we want 
 * a new sorted array from each recursion call thus we are creating a new object each time on a recursion call;
 *
 * and in the end we have to handle one edge case and then return the new sorted array....
 */
public class Merge {

    public static void main(String[] args) {
        // merge sort!!!

        int [] arr = {2,1,4,3,9};
        
        int [] ans = sortTheArr(arr);

        System.out.println(Arrays.toString(ans));
    }

    static int[] sortTheArr(int[] arr) {

        // base condition;

        if (arr.length == 1) {
            return arr;
        }

        // divide the array in two

        int mid = arr.length / 2;

        // there is two part a left and right "ARRAY"
        // now look we divide the array into two array, what we want is to divide the array unitl we ain't get the very last element .....

        int [] left = sortTheArr(Arrays.copyOfRange(arr, 0, mid)); // Copies the specified range of the specified array into a NEW ARRAY. "[0,mid)"
        int [] right = sortTheArr(Arrays.copyOfRange(arr, mid, arr.length));

        // so far what we are doing is to divide the arrays into new array at this line we are getting the new array which contains one element "single piece" now we have to compare and see if there is any edge cases or not!!! in more technicall we are actually top of stack which return a single element array,

        // make another func which compare this left and right and merge that and return a new and fresh array which contains all sorted element...

        // so what we are going to put inside this as a parameter obviously left and right and nothing i guess...
        return MixArr(left, right);


    }

    static int[] MixArr(int[] left, int[] right) {
        // compare and return mix

        // compare
        int i = 0; // for left right and new array(cause we need to track each element of new array
                   // as well)
        int j = 0;
        int k = 0;

        int[] mixArr = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                mixArr[k] = right[j];
                j++; // bcz now we are going to compare the next element with the left i,
            } else {
                mixArr[k] = left[i];
                i++;
            }
            // look now for the for the first time the first index is filled now we need to
            // go for the second element of a new arr; "EACH TIME"
            k++;
        }

        // now we cover almost all main thing
        // but here is the edge case we need to keep this in mind;
        // what if the size of the left is greater then right one and vice versa;
        // look the below code and pause and think; only focus on this line
        // "i < left.length"
        //

        while (i < left.length) {
            mixArr[k] = left[i];
            i++;
            k++;
        }

        // only one will going to execute if that happened

        while (j < right.length) {
            mixArr[k] = right[j];
            j++;
            k++;
        }

        return mixArr;
    }
}


// must revise!!!
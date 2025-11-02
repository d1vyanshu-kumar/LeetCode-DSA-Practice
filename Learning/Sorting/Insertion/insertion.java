import java.util.Arrays;

public class insertion {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 6, 7 };

        sortIns(arr);
        System.out.println(Arrays.toString(arr));

    }

    // this is sorting which is used to sort the arr and we are going to sort like
    // we are using two pointer and swapping from left and so one outer pointer is
    // going to the last cause we are checking to the last element and the other one
    // is second last but here is some catch that we don't need to check again to
    // all the left side array cause it is sorted like if the 2nd loop check that
    // the last element is is < then other one which is ahead of that element then
    // we are going to break that Loop.
    static void sortIns(int [] arr){
        
        for(int i = 0; i< arr.length - 1; i++){

            // look this above loop not going to the end cause the inner loop have to work that checking each element and we are taking j from i+ 1 through which we are going to compare and check each element and sort from the left.

            // now here are are going to take j>0 cause this is going to check each element and chose correct index for the target elemet but we have to take j > 0 cause we are no need to check after zero index :\ 
            for(int j = i + 1; j > 0; j--){
                if (arr[j-1] > arr[j]) {
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int [] arr, int firstElement, int secongElement){
        int temp = arr[firstElement];
        arr[firstElement] = arr[secongElement];
        arr[secongElement] = temp;
    }
}

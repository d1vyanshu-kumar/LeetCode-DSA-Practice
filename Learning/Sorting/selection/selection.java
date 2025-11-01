import java.util.Arrays;

public class selection {

    // look in the selection sort what we are doing is to find the maximum element and and swap that with the correct index this is how we are going to sort in selection sort

    // pick ans swap

    // again similar catch here as well we are going to sort the element form end then why we are going to check sorted part again and again
    public static void main(String[] args) {
        
        int [] arr = {2,3,4,1,5,6,0};

        select(arr);

        System.out.println(Arrays.toString(arr));
    }


    static void select(int [] arr){

        for(int i = 0; i < arr.length; i++){
            // find the max element

            int last = arr.length -1 - i;

            int maxElement  = findMax(arr, last);

            // now swap that max element with the last element;

            swapping(arr, maxElement, last);
        }
    }

    static int findMax(int[] arr, int end){

        int start = 0;
        
        for(int i = 0; i <= end; i++){
            if (arr[start] < arr[i]) {
                start = i;
            }
        }

        return start;
    }

    static void swapping(int [] arr, int firstelemt, int secondElement){

        int temp = arr[firstelemt];
       arr[firstelemt] = arr[secondElement];
       arr[secondElement] = temp;
    }
    
}


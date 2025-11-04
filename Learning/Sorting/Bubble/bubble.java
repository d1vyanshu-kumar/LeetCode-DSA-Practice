import java.util.Arrays;

public class bubble {

    // bubble sorting means swapping adjacent elements if it is not sorted. simple 
    public static void main(String[] args) {
        
        // sorting the existing arr

        int [] arr = {4,3,2,5,1};

        swapped(arr);

        System.out.println(Arrays.toString(arr));

    }

    // making a func which will going to swapped that
    static void swapped(int [] arr){
        
        // look we need to use two pointer or something like that where we are going to compare each element ans swap
        // but here is the catch after swapping one element in the end we get sorted from the end so we are not going to end part again and again so we need to just reduce the pointer as well after when the inner loop end.

        boolean swappped;

        // look you need outer loop which will run to the end
        for(int i = 0; i < arr.length; i++){
            // and the innner loop for swapping by comparing each element one by one 
            // but remember that after each itration we are going to see the sorted from the end so you dont need to check again to that element which is sorted from the end.

            // now look for this we need to apply one condition that j < arr.length - i cause we need to iginore the element from the last cause it is now sorted. we need to ignore that

            // for e.g in a very first time the inner loop goes to the last element and we know in the very time it sorted the 1st element and we dont need to look for that element for the next itration thus we are going to reduce j by this:
            // its a very common sense thing: j < arr.length - i;

            swappped = false;

            for(int j = 1; j < arr.length - i; j++){
                if (arr[j] < arr[j-1]) {
                    int tmpt = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmpt;

                    // now here is some catch again  look what if the given array. is already sorted so dont need to check that again and again so what we are going to do is if the swapping does not occour that means this array is already sorted

                    swappped = true;

                }
            }

            if (!swappped) {
            break;
        }
        }
    }
}

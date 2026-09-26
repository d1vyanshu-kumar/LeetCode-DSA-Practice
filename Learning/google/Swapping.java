package Learning.google;

import java.util.Arrays;

public class Swapping {

    public static void main(String[] args) {
        int [] arr = { 3,  7,  1,  9,  4 };

        int left = 0;
        int right = arr.length-1;

      while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      } 
      System.out.println(Arrays.toString(arr));
    }

    
    
}

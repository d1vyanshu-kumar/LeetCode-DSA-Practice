import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int [] arr = {3,2,5,6};
        sortTheArrInPlace(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sortTheArrInPlace(int[] arr, int s, int e) {

        // base condition;

        if (e - s == 1) {
            return ;
        }


        int mid = ( s + e) / 2;


        sortTheArrInPlace(arr, s, mid); 
        sortTheArrInPlace(arr, mid, e);

        
         MixArrInPlace(arr, s, mid, e);


    }

    static void MixArrInPlace(int[] arr, int s, int m, int e) {
        
        int i = s; 
        int j = m;
        int k = 0;

        int[] mixArr = new int[e-s];

        while (i < m && j < e) {
            if (arr[i] > arr[j]) {
                mixArr[k] = arr[j];
                j++;
            } else {
                mixArr[k] = arr[i];
                i++;
            }
           
            k++;
        }

    
        while (i < m) {
            mixArr[k] = arr[i];
            i++;
            k++;
        }


        while (j < e) {
            mixArr[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < mixArr.length; l++){
            arr[s+l] = mixArr[l];
        }
    }
}

/*
 * this is the question like every number is appears twice and u need to find one number which is not repeated twice
 */

/*
 * look what i need to do is remember this when ever this type of even repeated things is given in this question:
 * -1,2,3,-2,-3,1 if we are going to add all then we are going to get Zero and if there is a unique number then it wil be return that unique
 * number
 * so what we need to do is to make zero and then add.
 */
public class No_Twice {

    public static void main(String[] args) {

        int arr [] = {2,3,3,1,2,1,9};

        System.out.println(findNoDub(arr));
        
    }

    static int findNoDub(int[] arr){
        // is there any way through which we can make dub make zero: a Xor a = 0 
        
        // here we go:

        int ans = 0;     // 0 xor 1 = 1 okay!

        for(int i = 0; i < arr.length; i++){
            // we need to xor first and then we need to add and return that ans;
            
            ans ^= arr[i];
        }
        
        return ans;
    }
}

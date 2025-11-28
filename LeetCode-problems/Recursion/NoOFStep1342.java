public class NoOFStep1342 {
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
    public static void main(String[] args) {
        // its simple ig what we need to do is reduce the number to zero if the given number is even then divide by 2 else reduce by 1
        
        int num = 8;

        int ans = reduceNoZero(num);

        System.out.println(ans);
    }

    static int reduceNoZero(int n){

        // int count = 0;   look in the very first time i did this but this is actully wrong i reset the count thus it return only 1.

        // we need to write base case as well...

        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            // even case
            // just divide by number 2;
            return 1 + reduceNoZero(n/2);
            // count++;
        }else{
            return 1 + reduceNoZero(n - 1);
            // count++;
        }

    }
}
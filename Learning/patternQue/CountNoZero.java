public class CountNoZero {
    public static void main(String[] args) {

        // we have to find numbers of zero and return that...

        int num = 1040;

        int ans = findZero(num);
        System.out.println(ans);
    }

    static int findZero(int n) {
       

        return helper(n,0);

    }

    private static int  helper(int n, int c){

        if(n == 0){
            return c;
        }

        int rem = n % 10;

        if (rem == 0) {
            return helper(n/10, c + 1);
        }

        return helper(n/10, c);
    }
}

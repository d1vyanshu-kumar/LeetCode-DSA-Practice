public class PrimeNo {

    public static void main(String[] args) {
        //  prime number means divisible by 1 and itself.
        // we need to check each element one by one from two to the number itself so if there anynumber % with that is equal to zero then its noy a prime number.
        // don't u think it will repeat some number again and agiain like 2 * 12 and 12 * 2 same thing right so we ned to make sure we are ignore after the square root of that number. that makes timecomplexity = root under T.


        // basically we need to go to the root T.


        // boolean ans = isPrime(12);

        // System.out.println(ans);

        int n = 20;

        for(int i = 0; i <= n; i++){
            System.out.println(i + " is prime: "+  isPrime(i));
        }
 
    }

    static boolean isPrime(int n){

        if (n == 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }

            c++;
        }

        return true;
    }
}
// this is the question in which we have to find all the prime numbers from 1 to n
public class Seive {

    public static void main(String[] args) {
        /*
        *how can we do this, look as we know that we have to only gp to the root n cause every number is going to repeat itself in a opposite manner
         so we don't need to exclude that thus we have to up to root of that number;
         * okay so question what we can do is we are going to execute the code root N. and we are checking each number but as i am said that we have to go
         * to root n cause all the multiple of that number is included like multiple of 2 to 4,6,8 and 12 and so on now here is the catch that as you can
         * see that 6 is in both 3 and 2 so i am saying that if we are going to check for two and then we are also going to check for all  other number multiples
         * now look if the number have multiple that means that number is not a prime number for e.g 2 have no any multiples now we are not going to check directly
         * 3 but we  have to check for the multiple of like i + 2 ans then up to the number N where i have to find the prime number and then we are going to
         * check 3 and other of its remaining number and we have to exclude all the number which we are checked for the previous number multiple
         * thus for this we need to make an Boolean array and we know that empty array cause by default value is false so we are going to check each number is
         * prime or not through that array. ig i will get an idea from this so i think it enough!!!
        */

        int n = 40;
        boolean [] primes =new boolean[n + 1];  // now why we are taking n + 1; cause 0 to n: total element n + 1;

        // java array indexes strat with zero not 1. 
        seiveNo(n,primes);



    }

    // as we know that every position return false as of now from the bool arr so what we are going to do is assume all of the element which is false is prime
    // and we will make true value as a multiple of prime number.
    static void seiveNo(int n,boolean[] nums){
        for (int i = 2; i * i <=n; i++){
            if (!nums[i]){
                for (int j = i * 2; j <= n; j+=i){    // multiple of number is not prime 
                    nums[j] = true;  // true for not prime
                }
            }
        }

        for (int i = 2; i <= n ; i++) {
            if (!nums[i]){
                System.out.println(i);
            }
        }
    }

}

// do revise of HM...
// O(n logn)
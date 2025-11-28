public class SumOfDigit {
    public static void main(String[] args) {
        //  we need to find the sum of digit 
        // for 3.g 23 => 5

        int num = 1234;

        System.out.println(findSum(num));
    }

    // though recursion here is how things look like:  1 + f(234); .....and so on
    // now how can we get the very first digit? by talking reminder!!! 
    // base condition will be when the element get zero return zero itslef.

    static int findSum(int n){

        if (n == 0) {
            return 0;
        }

        int getDigit = n % 10;

        return getDigit + findSum(n/10);
    }

    // remember in product 0 * n = 0;
}

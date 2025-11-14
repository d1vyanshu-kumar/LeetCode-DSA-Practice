// rec is the very easy topic u just need to call the func itslef again and again...
// linear rec is the very bad one cause here u call so many time same func: + , -
// the best is divide and conq which we are divide continously and get the answer.

public class Fibo {
    public static void main(String[] args) {
        System.out.println(finonacci(3));
    }

    // what the Fibonacci it is the sum of two previous number..

    static int finonacci(int n){

        // need to define the base condition other wise stack is going to overflow.

        if (n == 0) {
            return n;
        }else if (n == 1) {
            return n;
        }

        return finonacci(n - 1) + finonacci(n-2);
    }
}

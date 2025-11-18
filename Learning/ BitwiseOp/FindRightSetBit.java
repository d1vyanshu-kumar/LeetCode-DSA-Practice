/*
 * find the right most setBit and return that number
 * look what we can do is for this is 
 * take an example: 10: 1010 = n
 * and if we want 1 on the very right side we need to do something like this a = 10 b = 1 , c = 0 == abc = 1010
 * and if we and abc with a(neg)1c this will give exactly what we want. so look how can we do this?
 * in binary there is a one bit is reserved which is left most bit for negative and positve if 0 then + ans 1 then -ve
 * and this is the representation of (-n) = a(neg)1c = a(neg)bc
 * lets see how this statment is correct:  
 * so here is the ques that how can we write -ve number in binary: here are the steps:
 * 1) take complement of number
 * 2) + 1 to it
 * why?
 *  0 - n = -n ans as we know that we can only store 8 bits in binary after 8 bits the number will going to ignored
 * 100000000(one will ignore 9th posn)- 00001010       and in binary we can write 8 = 7(111)+ 1 , 16 = 15(1111) + 1
 * 11111111 + 1 - 00001010 (same thing) == (11111111 - 00001010) + 1
 * and now if u notice this (11111111 - 00001010)  will give (neg) of 00001010 = 11110101 and step 2 is  add + 1
 */

public class FindRightSetBit {

    public static void main(String[] args) {

        int n = 10; // binary: 1010
        int rightMostSetBit = findRightMostSetBit(n);

        System.out.println("Number: " + n + " (" + Integer.toBinaryString(n) + ")");
        System.out.println("Rightmost set bit: " + rightMostSetBit);
    }

    static int findRightMostSetBit(int n) {
        return n & -n;  // isolates the rightmost set bit
    }
}

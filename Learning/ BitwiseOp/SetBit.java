/*
 * this is about making setbit like of the target bit is zero make it one and if it is one make it one like as it is and return the final value.
 */
public class SetBit {

    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(10));

        System.out.println(findAns(10, 3));

    }

    static int findAns(int n, int target) {

        // we need to first find the target

        int mask = 1 << (target - 1);

        int ans =  n | mask;

        return ans;
    }
}

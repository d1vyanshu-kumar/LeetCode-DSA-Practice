public class EvenNo_1295 {

    public static void main(String[] args) {
        int [] nums = {555,901,482,1771};

        System.out.println(findingEvenDigit(nums));
    }

    // making a  function that takes that nums arr and return totak numbers which contains even digit
    static int findingEvenDigit(int [] nums){
        // creating a var which will increased as if the number contains the even digit
        int countEven = 0;
        // gettting each element one by one from the arr.
        for (int element : nums) {
        // and that number contain even digit then it will increase the count even by 1.
         if(digit(element)){
            countEven ++;
         }

        }

        return countEven;
    }
    
    // here we count the digit and if this one is going to be the even it will return true;
    static boolean digit(int element){
        // taking the Given number
        int count = 0;
        while (element > 0) {
            element = element / 10;
            count ++;
        }

        if (count % 2 == 0) {
            return true;
        }

        return false;
    }
}

package Learning.HashMap;

public class MostFreqElem {

    // the question is about the arr contains multiple elements and we have to
    // retrun which is repeated most of the time and also if more then one elements
    // repated with a same time we can just return the element whichh is the greater
    // one okay!

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 4, 1 };

        System.out.println(findMostFreqEle(arr));
    }

    private static int findMostFreqEle(int[] arr) {

        int freq = 0;

        int value = 0;

        for (int i = 0; i <= arr.length - 1; i++) {

            int j = arr.length - 1;
            int temp = 0;

            while (i <= j) {

                if (arr[j] == arr[i]) {
                    temp++;
                    j--;
                } else {
                    j--;
                }
            }

            // now what we have to do is store this temp value to the freq container.
            // we have to return the element okay

            if (freq < temp) {
                freq = temp;
                value = arr[i];
            } else if (freq == temp) {
                // we have to check the index value
                // we have to check with the pervious index value
                int currentValue = arr[i];
                int perviousValue = value;
                if (currentValue > perviousValue) {
                    value = currentValue;
                }
            }

        }

        return value;

    }

}


// temp should be inside the for loop cause it supposed to be reset in every next executions okay.
package Learning.Hashing;

import java.util.HashMap;

import com.apple.laf.resources.aqua;

// public class MostFreqElem {

//     // the question is about the arr contains multiple elements and we have to
//     // retrun which is repeated most of the time and also if more then one elements
//     // repated with a same time we can just return the element whichh is the greater
//     // one okay!

//     public static void main(String[] args) {

//         int[] arr = { 1, 2, 2, 4, 1 };

//         System.out.println(findMostFreqEle(arr));
//     }

//     private static int findMostFreqEle(int[] arr) {

//         int freq = 0;

//         int value = 0;

//         for (int i = 0; i <= arr.length - 1; i++) {

//             int j = arr.length - 1;
//             int temp = 0;

//             while (i <= j) {

//                 if (arr[j] == arr[i]) {
//                     temp++;
//                     j--;
//                 } else {
//                     j--;
//                 }
//             }

//             // now what we have to do is store this temp value to the freq container.
//             // we have to return the element okay

//             if (freq < temp) {
//                 freq = temp;
//                 value = arr[i];
//             } else if (freq == temp) {
//                 // we have to check the index value
//                 // we have to check with the pervious index value
//                 int currentValue = arr[i];
//                 int perviousValue = value;
//                 if (currentValue > perviousValue) {
//                     value = currentValue;
//                 }
//             }

//         }

//         return value;

//     }

// }

// // temp should be inside the for loop cause it supposed to be reset in every next executions okay.

// lets solve this with a very perfect and a very right approach:

public class MostFreqElem {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 4 };
        System.out.println(findMostFreqEle(arr));

    }

    private static int findMostFreqEle(int[] arr) {

        int max_count = 0; // value;
        int ans = 0; // keys ---- jo ki hamara ans hain!

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= arr.length - 1; i++) {

            // if the element is not the hash map then i have to add here and if it is
            // already there then we just have to increament by 1;

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (max_count < map.get(arr[i])) {
                max_count = map.get(arr[i]);
                ans = arr[i];

            }else if (max_count == map.get(arr[i])){ 
                // now we have to check the value of both okay

                int previous_value = ans;
                int current_value = arr[i];

                if (previous_value < current_value) {
                    ans = current_value;
                }
            }
        }

        return ans;

    }

}
package Learning.Hashing;

import java.util.HashMap;

public class ArraySubset {

    public static void main(String[] args) {
        int[] arr1 = { 11, 1, 13, 21, 3, 7 };
        int[] arr2 = { 11, 3, 7, 1, 233};

        System.out.println(isSubset(arr1, arr2));

    }

    private static boolean isSubset(int[] arr1, int[] arr2) {
        // finding weather the arr2 is the subset of the arr 1
        // that means we have to mark the visited element of the arr 1

        HashMap<Integer, Integer> map = new HashMap<>();     

        // inserting the a1 elements in the hash map and then i have to search for the
        // a2 elements
        for (int i = 0; i < arr1.length; i++) {
            // if the element is not inside the map then we are going add it and also add
            // the value which is "0 + 1" and if it is then we are going to inc its value by
            // 1.
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }

        // after insertion we have to check the elemnets for the map for the array 2
        // okay. if it is in he map then we simply have to drop the value by 1
        // also we need to make sure that the count of each element from the arr1 is greater then zero!
        for (int i : arr2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                map.put(i, map.get(i) - 1);
            }else{
                return false;
            }
        }

        return true;
    }

}

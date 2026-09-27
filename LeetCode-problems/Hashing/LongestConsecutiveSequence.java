import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        System.out.println(findingLengthofArr(arr));
    }

    private static int findingLengthofArr(int[] arr) {

        // we have to do this in O(N);
        /// look if everything will be sorted then how easy it will be you just need to
        // find the length
        /// lets sort this broh, but after sorting we need a concequtive element not
        // like a random shot
        /// so what if we go like this
        /// okay we have to find the very first number where evervything is started
        /// examples: if we find b and if there is a not exist then maybe it is the
        // satrting point
        /// if there is b and b-1 = a which is exist then skip it cause it is the middle
        // element
        /// so basically we have to check the number - 1 but wait where are we actually
        // checking
        /// obb we have to do this in n time then hash Set also case dublicate alert!
        ///

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            // removing the dublicate element

            set.add(arr[i]);
        }
        int longestStreak = 0;

        for (int i : set) {

            if (set.contains(i - 1)) {
                continue; // may be this is the middle element so skip for now!
            }

            // now we have to check the furthure element like the next element

            // finding the first element

            if (!set.contains(i - 1)) {

                int currentNum = i;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);

            }
        }

        return longestStreak;
    }
}

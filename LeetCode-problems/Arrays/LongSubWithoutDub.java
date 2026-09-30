import java.util.HashSet;

public class LongSubWithoutDub {

    public static void main(String[] args) {

        String s = "abcabcbb";

        System.out.println(findLongSub(s));
    }

    private static int findLongSub(String s) {

        HashSet<Character> set = new HashSet<>();

        int max_length = 0;

        int left = 0;

        for(int right = 0; right < s.length(); right++){

            while (set.contains(s.charAt(right))) {
                // we want the longet substring length which will already stored in the just previous execition. abc, bc
                set.remove(s.charAt(left)); 
                left++;
            }

            set.add(s.charAt(right));

            max_length = Math.max(max_length, right - left + 1);

        }


       

        return max_length;
    }
}

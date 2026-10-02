import java.util.HashMap;

public class permutationinstring {
    public static void main(String[] args) {

        String s1 = "ab"; // ab and ba
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {

        /// create a window length with the same size as the s1 and then slide that
        /// window into the s2 the arr of char doesn't matter
        /// the only thing is the matter is the freq count for the permutation
        ///

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // System.out.println(freq);

        int window_length = s1.length();
        System.out.println(window_length);

        for (int left = 0; left < s2.length() - s1.length(); left++) {

            HashMap<Character, Integer> freq2 = new HashMap<>();

            for (int right = left; right < left + window_length; right++) {
                char c = s2.charAt(right);
                freq2.put(c, freq2.getOrDefault(c, 0) + 1);
            }

            // If frequencies match, we found a permutation
            if (freq.equals(freq2)) {
                System.out.println(freq);
                System.out.println(freq2);

                return true;

            }

        }

        return false;
    }

}

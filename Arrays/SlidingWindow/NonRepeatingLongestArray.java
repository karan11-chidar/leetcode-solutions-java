package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingLongestArray {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        // Result store
        int ans = 0;
        // Use Map To Unique Keys
        Map<Character, Integer> map = new HashMap<>();
        // Pointers
        int i = 0;
        int j = 0;
        // Looping
        while (j < size) {
            // Character to j
            char ch = s.charAt(j);
            // Expand window
            // Add Char to Map
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            // Shrink Window
            while ((j - i + 1) > map.size()) {
                // character to i
                char exitChar = s.charAt(i);
                // value ko map me kaam karo
                map.put(exitChar, map.get(exitChar) - 1);
                // agar meri value zero hai toh use remove karo map se
                if (map.get(exitChar) == 0)
                    map.remove(exitChar);
                i++;
            }
            // agar mere map ki key window ke barabar hai toh ans nikalo
            if (map.size() == (j - i + 1)) {
                ans = Math.max(ans, j - i + 1);
            }
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        NonRepeatingLongestArray obj = new NonRepeatingLongestArray();
        String testString = "abcabcbb";
        int result = obj.lengthOfLongestSubstring(testString);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}

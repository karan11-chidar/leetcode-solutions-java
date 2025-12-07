package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumSizeWindowSubString {
    public String minWindow(String s, String t) {
        // Edge Case
        if (s.length() < t.length())
            return "";
        int size = s.length();
        // Storing to character frequency
        Map<Character, Integer> bag = new HashMap<>();
        // Convert to t string in a map
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            // Store in map
            bag.put(ch, bag.getOrDefault(ch, 0) + 1);
        }
        // Length to a window intail value to long
        int minLength = Integer.MAX_VALUE;
        // Index to store i where staring in a substring
        int startHead = 0;
        // Counter to Element store in a map
        int elementBag = bag.size();
        // Pointers
        int i = 0;
        int j = 0;
        // Traverse in Orignal String
        while (j < size) {
            char currentChar = s.charAt(j);
            // check ki bag me currentchar hai
            if (bag.containsKey(currentChar)) {
                // Toh count ko update karo
                bag.put(currentChar, bag.get(currentChar) - 1);
                // check kiCurrent char ki value 0 ho gyi
                if (bag.get(currentChar) == 0)
                    elementBag--;
            }
            // so requirment is full
            while (elementBag == 0) {
                // update window size
                if ((j - i + 1) < minLength) {
                    minLength = j - i + 1;
                    startHead = i;
                }
                // Minimize window size
                // Shrink window
                char exitChar = s.charAt(i);
                // check ki joh element bag se nikal rahe hai woh apne kaam ka toh nahi hai
                if (bag.containsKey(exitChar)) {
                    // Agar hai toh usse ++ karo kyuki hame woh chaiye
                    bag.put(exitChar, bag.get(exitChar) + 1);
                    // Check ki kya hamra exit wala element zero se greter hai
                    if (bag.get(exitChar) > 0) {
                        // Toh bag me element counter ko badao
                        elementBag++;
                    }
                }
                // Then update to i
                i++;
            }
            j++;
        }
        return (minLength == Integer.MAX_VALUE) ? "" : s.substring(startHead, startHead + minLength);
    }

    public static void main(String[] args) {
        MinimumSizeWindowSubString msws = new MinimumSizeWindowSubString();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = msws.minWindow(s, t);
        System.out.println("Minimum size window substring: " + result);
    }
}

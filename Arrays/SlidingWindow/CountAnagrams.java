package SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class CountAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int size = s.length();
        // Window size
        int k = p.length();
        // Index ko store karne ke liye list banayenge
        List<Integer> res = new ArrayList<>();
        // map use karenge pattern ko store karne ke liye
        Map<Character, Integer> map = new HashMap<>();
        // Ham patternn ko map me convert kar denge
        for (int i = 0; i < k; i++) {
            char ch = p.charAt(i);
            // agar mera ye wala character me map hai toh usse + karna agar nahi ho toh null
            // mat dena 0 kar dena
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // Map counter size
        int mapCounterSize = map.size();
        // Pointers
        int i = 0;
        int j = 0;
        // agar mera j is less size ho toh loop going on
        while (j < size) {
            // current character
            char currentChar = s.charAt(j);
            // Agar currentChar ki key map me hai toh true
            if (map.containsKey(currentChar)) {
                // toh use decrement karo
                map.put(currentChar, map.get(currentChar) - 1);
                // agar map ki zero ho gyi toh map ka size bhi decrement karo
                if (map.get(currentChar) == 0) {
                    mapCounterSize--;
                }
            }
            // Window Badho
            if (j - i + 1 < k) {
                j++;
            }
            // Window completely
            else if (j - i + 1 == k) {
                // agar mera mapsize equal zero ho toh list me index add karo
                if (mapCounterSize == 0)
                    res.add(i);
                // slide window
                char exitChar = s.charAt(i);
                // kya exit wala charcter map me tha
                if (map.containsKey(exitChar)) {
                    // hai toh increment karo
                    map.put(exitChar, map.get(exitChar) + 1);
                    // or map size ko bhi increment karo
                    if (map.get(exitChar) == 1)
                        mapCounterSize++;
                }
                i++;
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "forxxorfxdofr";
        String p = "for";
        List<Integer> result = new CountAnagrams().findAnagrams(s, p);
        System.out.println(result); // Output: [0, 8, 9]
    }
}
package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraykUniqueChara {
    public int longestKSubstr(String s, int k) {

        int size = s.length();
        int ans = -1; // Agar K unique chars mile hi nahi, toh -1 return hoga

        // Map: Character aur uski Frequency store karne ke liye
        Map<Character, Integer> map = new HashMap<>();

        // Pointers: sr = Start (Left/Shrink), ep = End (Right/Expand)
        int sr = 0;
        int ep = 0;

        // --- STEP 1: Loop Shuru (Rubber Band Kheechna) ---
        while (ep < size) {

            // Current character nikalo
            char ch = s.charAt(ep);

            // Map me daalo (Expand): Agar naya hai toh size badhega, purana hai toh count
            // badhega
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // --- STEP 2: Shrink Logic (Agar Window Invalid ho gayi) ---
            // Condition: Agar Unique Characters (Map Size) K se zyada ho gaye
            while (map.size() > k) {

                char exitChar = s.charAt(sr); // Jo character peeche se nikaalna hai

                // Uska count kam karo
                map.put(exitChar, map.get(exitChar) - 1);

                // IMPORTANT: Agar count 0 ho gaya, toh Map se REMOVE karo
                // Taaki map.size() kam ho sake
                if (map.get(exitChar) == 0) {
                    map.remove(exitChar);
                }

                sr++; // Window choti karo (Left se aage badho)
            }

            // --- STEP 3: Answer Calculation (Valid Window par) ---
            // Hum sirf tabhi answer lenge jab EXACTLY K unique characters honge
            if (map.size() == k) {
                // Purane ans aur abhi ki length (ep - sr + 1) me se max lo
                ans = Math.max(ans, ep - sr + 1);
            }

            // --- STEP 4: Aage Badho ---
            ep++; // Right pointer ko aage badhao
        }

        return ans;
    }

    void main() {
        LongestSubarraykUniqueChara lskuc = new LongestSubarraykUniqueChara();
        String s = "aabacbebebe";
        int k = 3;
        int result = lskuc.longestKSubstr(s, k);
        System.out.println("Longest substring with " + k + " unique characters: " + result);

    }
}

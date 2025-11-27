package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        // Result array ka size
        int[] ans = new int[n - k + 1];
        int ri = 0; // Result index pointer

        // Deque banaya (Yeh Indices/Address store karega, Values nahi!)
        Deque<Integer> q = new ArrayDeque<>();

        int i = 0;
        int j = 0;

        while (j < n) {

            // --- RULE 1: Chhoton ki Chhutti (Safai Abhiyaan) ---
            // Jab tak list khali nahi hai AUR
            // List ke peeche wale bande ki Taaqat < Naye bande (nums[j]) ki Taaqat hai
            while (!q.isEmpty() && nums[q.peekLast()] < nums[j]) {
                q.pollLast(); // Peeche wale ko laat maar ke nikaal do
            }

            // --- RULE 2: Naye ki Entry ---
            // Ab line saaf hai, khud peeche jaake khade ho jao
            // Note: Hum 'j' (Index) store kar rahe hain
            q.offerLast(j);

            // --- Window Size Check ---
            if (j - i + 1 < k) {
                j++; // Window abhi chhoti hai, badhate raho
            } else if (j - i + 1 == k) {

                // --- STEP A: Answer Note Karo ---
                // Deque ka Front hamesha sabse bada Don hota hai
                // Note: Hum index se value nikaal rahe hain nums[q.peekFirst()]
                ans[ri++] = nums[q.peekFirst()];

                // --- STEP B: Slide Logic (Purana Don gaya kya?) ---
                // Kya Front wala index wahi hai jo 'i' par hai (jo bahar ja raha hai)?
                if (q.peekFirst() == i) {
                    q.pollFirst(); // Haan, toh usse Front se nikaal do
                }

                // Slide Window
                i++;
                j++;
            }
        }

        return ans;
    }

    void main() {
        SlidingWindowMaximum swm = new SlidingWindowMaximum();
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] result = swm.maxSlidingWindow(nums, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
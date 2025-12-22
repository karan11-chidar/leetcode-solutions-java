package prefixsum_And_sufixsum;

import java.util.HashMap;

public class SubarraySumequalK {
     public int subarraySum(int[] nums, int k) {
//***************************Brute-Force solution********************************** */

        // int size = nums.length;
        // // Counter 
        // int count = 0;
        // // Traverse array
        // // Outer Loop
        // for(int i=0; i<size; i++){
        //     // Current Sum
        //     int currentSum = 0;
        //     // Inner Loop
        //     for(int j=i; j<size; j++){
        //         currentSum += nums[j];
        //         // Check sum is equal to k
        //         if(currentSum==k) count++;
        //     }
        // }
        // return count;

//*********************************Optimize Solution********************************** */
        // 1. History Note Karne Wali Diary (HashMap)
        // Key = Sum (Jo ab tak bana), Value = Count (Wo sum kitni baar aaya)
        HashMap<Integer, Integer> map = new HashMap<>();

        // 2. Base Case: Shuruat mein Sum 0 hota hai (Empty subarray)
        // Iska count 1 rakhte hain taaki agar pehla hi number K ke barabar ho toh wo count ho sake
        map.put(0, 1);

        int currentSum = 0; // Abhi tak ka total sum
        int count = 0;      // Total valid subarrays ki ginti

        // 3. Array par loop lagao
        for (int i = 0; i < nums.length; i++) {
            
            // Step A: Aage badho aur sum mein jodo
            currentSum = currentSum + nums[i];

            // Step B: Dhoondo ki kya purane hisaab mein koi aisa sum hai
            // jise hatane par 'k' bache?
            int puranaSumJoChahiye = currentSum - k;

            // Step C: Diary (Map) check karo
            if (map.containsKey(puranaSumJoChahiye)) {
                // Agar haan, toh jitni baar wo purana sum aaya tha, utna count badhao
                count = count + map.get(puranaSumJoChahiye);
            }

            // Step D: Ab jo naya Current Sum bana hai, usse Diary mein note kar lo
            // Agar pehle se tha toh +1 kar do, nahi tha toh 1 daal do
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        SubarraySumequalK obj = new SubarraySumequalK();
        int[] nums = { 1, 1, 1 };
        int k = 2;
        int result = obj.subarraySum(nums, k);
    }
}

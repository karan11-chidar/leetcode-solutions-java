package slidingwindow;

import java.util.Arrays;

public class RadiusSubArrayAverage {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;

        // Window ka Total Size (Left + Khud + Right)
        int windowSize = 2 * k + 1;

        long windowSum = 0; // Sum long mein lena zaroori hai
        int[] result = new int[n];
        Arrays.fill(result, -1); // Sab jagah -1 bhar do (Kinare handle ho gaye)

        // Agar array window se chota hai, toh -1 hi return kar do
        if (n < windowSize) {
            return result;
        }

        int i = 0;
        int j = 0;

        while (j < n) {
            // 1. Calculation (Sum mein add karo)
            windowSum += nums[j];

            // 2. Window Choti hai? (Size check)
            if (j - i + 1 < windowSize) {
                j++;
            }

            // 3. Window Hit (Size Match)
            else if (j - i + 1 == windowSize) {
                // --- ASLI KAAM YAHAN HOGA ---

                // Center decide karo: i se k kadam aage
                int center = i + k;

                // Average store karo
                result[center] = (int) (windowSum / windowSize);

                // --- SLIDE KARO ---
                windowSum -= nums[i]; // Purana banda hatao
                i++;
                j++;
            }
        }

        return result;
    }

    void main() {
        RadiusSubArrayAverage rsa = new RadiusSubArrayAverage();
        int[] nums = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        int k = 3;
        int[] result = rsa.getAverages(nums, k);

        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
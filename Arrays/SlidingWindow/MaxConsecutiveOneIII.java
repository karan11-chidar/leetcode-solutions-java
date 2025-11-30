package SlidingWindow;

public class MaxConsecutiveOneIII {
    public int longestOnes(int[] nums, int k) {
        int size = nums.length;
        // Counter Of Zeros
        int countZeros = 0;
        // Result Store
        int res = 0;
        // Pointers
        int i = 0;
        int j = 0;
        // Looping
        while (j < size) {
            // Zero ko badhao agar j zero ho toh
            if (nums[j] == 0) {
                countZeros++;
            }
            // Window ko Shrink karo
            while (countZeros > k) {
                // Exit element
                int exit = nums[i];
                // Agar exit element zero ho toh -- karo
                if (exit == 0)
                    countZeros--;
                i++;
            }
            // Result nikalo
            res = Math.max(res, (j - i + 1));
            j++;
        }
        return res;
    }

    void main() {
        MaxConsecutiveOneIII mco = new MaxConsecutiveOneIII();
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        int result = mco.longestOnes(nums, k);
        System.out.println(result);
    }
}

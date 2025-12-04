package SlidingWindow;

public class MinimumSizeSubArraySumm {
    public int minSubArrayLen(int target, int[] nums) {
        int size = nums.length;
        // Pointers
        int i = 0;
        int j = 0;
        // Current Sum
        int currSum = 0;
        // Result Store
        int res = Integer.MAX_VALUE;
        // Looping
        while (j < size) {
            // Add karo current element ko
            currSum += nums[j];
            // Shrink the window
            while (currSum >= target) {
                // Calculate the length
                res = Math.min(res, (j - i + 1));
                // Exit element
                int exit = nums[i];
                // Remove the exit element from current sum
                currSum -= exit;
                // Move the left pointer
                i++;
            }
            // Move the right pointer
            j++;
        }
        return (res == Integer.MAX_VALUE) ? 0 : res;
    }

    void main() {
        MinimumSizeSubArraySumm mss = new MinimumSizeSubArraySumm();
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        int result = mss.minSubArrayLen(target, nums);
        System.out.println(result);
    }
}
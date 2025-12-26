package prefixsum_And_sufixsum;

public class FindMinimumStartValue {
    public int minStartValue(int[] nums) {
        int size = nums.length;
        // Store Minimum PrefixSum
        int minSum = 0;
        // Current Sum
        int currentSum = 0;
        // Traverse Loop
        for (int i = 0; i < size; i++) {
            // Calculate currentSum
            currentSum += nums[i];
            // Update Minimum Sum
            minSum = Math.min(currentSum, minSum);
        }
        return 1 - minSum;
    }
    void main() {
        FindMaximumAltitude obj = new FindMaximumAltitude();
        int[] gain = { -3, 2, -3, 4, 2 };
        System.out.println(obj.largestAltitude(gain));
    }
}

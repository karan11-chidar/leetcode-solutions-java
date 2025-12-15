package kadanesalgorithum;

public class AbsoluteSumSubarray {
    public int maxAbsoluteSum(int[] nums) {
        int size = nums.length;
        // Store Maximum Sum
        int maxSum = Integer.MIN_VALUE;
        // Store Minimum Sum
        int minSum = Integer.MAX_VALUE;
        // Current Sums
        int currentMinSum = 0;
        int currentMaxSum = 0;
        // Traversse
        for (int i = 0; i < size; i++) {
            // calute currents sum
            currentMinSum += nums[i];
            currentMaxSum += nums[i];
            // Update Max Sum
            maxSum = Math.max(maxSum, currentMaxSum);
            // Update Min Sum
            minSum = Math.min(minSum, currentMinSum);
            // Check currentMaxSum less than 0
            if (currentMaxSum < 0)
                currentMaxSum = 0;
            // Check currentMinSum greter than 0
            if (currentMinSum > 0)
                currentMinSum = 0;
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
    void main() {
        AbsoluteSumSubarray obj = new AbsoluteSumSubarray();
        int[] arr = { 1, -3, 2, 3, -4 };
        int result = obj.maxAbsoluteSum(arr);
        System.out.println("The Maximum Absolute Subarray Sum is: " + result);
    }
}

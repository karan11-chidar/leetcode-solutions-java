package kadanesalgorithum;

public class MaximumSumSubArray {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        // Reslut Store
        int res = Integer.MIN_VALUE;
        // Current sum store
        int currentSum = 0;
        // Traverse
        for (int i = 0; i < size; i++) {
            // calculate currentSum
            currentSum += nums[i];
            // update max res
            res = Math.max(res, currentSum);
            // check currentSum is less than 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return res;
    }

    void main() {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
    }
}

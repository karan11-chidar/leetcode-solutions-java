public class MaximumScoreofaSplit {
    public long maximumScore(int[] nums) {
        int size = nums.length;
        // store res
        long maxScore = Long.MIN_VALUE;
        // Store Prefisum
        long prefixSum[] = new long[size];
        // Store suffixMin
        long suffixMin[] = new long[size];
        // first fill element
        prefixSum[0] = nums[0];
        suffixMin[size - 1] = nums[size - 1];
        // Traverse Array
        for (int i = 1; i < size; i++) {
            // Calculate PrefixSum
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        // SuffixMin
        for (int i = size - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }
        // Calculate socre
        for (int i = 1; i < size; i++) {
            maxScore = Math.max((prefixSum[i - 1] - suffixMin[i]), maxScore);
        }
        return maxScore;
    }
    void main() {
        MaximumScoreofaSplit obj = new MaximumScoreofaSplit();
        int[] nums = { 2, -1, -4, -3, 5, -2 };
        System.out.println(obj.maximumScore(nums));
    }
}

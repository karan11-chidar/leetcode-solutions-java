package prefixsum_And_sufixsum;

public class RangeQuerySum {
    int [] prefixSum;

    public RangeQuerySum(int[] nums) {
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
    }
    public int rangeSum(int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        } else {
            return prefixSum[right] - prefixSum[left - 1];
        }
    }
    void main(){
        int[] nums = {1, 2, 3, 4, 5};
        RangeQuerySum obj = new RangeQuerySum(nums);
        System.out.println(obj.rangeSum(1, 3)); // Output: 9 (2 + 3 + 4)
    }
}

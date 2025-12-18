package prefixsum_And_sufixsum;

public class MiddleIndex {
    public int findMiddleIndex(int[] nums) {
        int size = nums.length;
        // Calculate TotalSum
        int totalSum = 0;
        // Traverrse array
        for (int i = 0; i < size; i++) {
            totalSum += nums[i];
        }
        // Calculate Left Sum
        int leftSum = 0;
        // Loop
        for (int i = 0; i < size; i++) {
            // calculate rightSum
            int rightSum = totalSum - leftSum - nums[i];
            // Check rightSum is equal to leftSum
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        MiddleIndex obj = new MiddleIndex();
        int[] nums = {2, 3, -1, 8, 4};
        System.out.println(obj.findMiddleIndex(nums));
    }
}

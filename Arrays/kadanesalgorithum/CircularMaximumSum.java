package kadanesalgorithum;

public class CircularMaximumSum {
    public int maxSubarraySumCircular(int[] nums) {
        int size = nums.length;
        // Varalbes Deaclations
        // Store MinSum
        int globalMinSum = Integer.MAX_VALUE;
        // Store MaxSum
        int globalMaxSum = Integer.MIN_VALUE;
        // Store TotalSum
        int totalSum = 0;
        // Store currentMaxSum
        int currentMaxSum = 0;
        // Store currentMinsum
        int currentMinSum = 0;
        // Traverse Array
        for (int i=0; i<size; i++){
        // Calculate TotalSum
        totalSum += nums[i];
        // Calculate currentMaxSum
        currentMaxSum += nums[i];
        // Calculate currentMinSum
        currentMinSum += nums[i];
        // update first to maxSum
        globalMaxSum = Math.max(globalMaxSum,currentMaxSum);
        // update second to min Sum
        globalMinSum = Math.min(globalMinSum,currentMinSum);
        // check currentMaxSum is less than 0
        if(currentMaxSum<0) currentMaxSum = 0;
        // check currentMinSum is gretan than 0
        if(currentMinSum>0) currentMinSum = 0;
        }
        // exiting loop
        // check maxSum is less than 0 so return 
        if(globalMaxSum<0) return globalMaxSum;
        // return which is gretan than circular or normal
        return Math.max(globalMaxSum,(totalSum-globalMinSum));
    }
    void main() {
        CircularMaximumSum obj = new CircularMaximumSum();
        int[] arr = { 5, -3, 5 };
        int result = obj.maxSubarraySumCircular(arr);
        System.out.println("The Maximum Circular Subarray Sum is: " + result);
    }
}

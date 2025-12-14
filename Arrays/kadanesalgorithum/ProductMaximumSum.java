package kadanesalgorithum;
public class ProductMaximumSum {
    public double maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        double maxProduct = nums[0];
        double minProduct = nums[0];
        double result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                double temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
    void main(){
        ProductMaximumSum obj = new ProductMaximumSum();
        int[] arr = {2,3,-2,4};
        double result = obj.maxProduct(arr);
        System.out.println("The Maximum Product Subarray is: " + result);
    }
}

package prefixsum_And_sufixsum;


public class Product_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        // **************************Brute-Force
        // Solution******************************** */

        // int size = nums.length;
        // //Result Array
        // int res[] = new int[size];
        // // Traverse Array
        // // OuterLoop
        // for(int i=0; i<size; i++){
        // // calculate left product
        // int leftP = 1;
        // // Inner Left product
        // for(int j=0; j<i; j++){
        // leftP *= nums[j];
        // }
        // // calculate right product
        // int rightP = 1;
        // for(int k=i+1; k<size; k++){
        // rightP *= nums[k];
        // }
        // res[i] = leftP*rightP;
        // }
        // return res;

        // *****************Optimization Solution******************************** */
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        // 1. Left Array Banao (Aage se)
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            // Formula: Pichla Left * Pichla Number
            left[i] = left[i - 1] * nums[i - 1];
        }

        // 2. Right Array Banao (Peeche se)
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            // Formula: Agla Right * Agla Number
            // Note: i+1 ka matlab 'Agla' hota hai
            right[i] = right[i + 1] * nums[i + 1];
        }

        // 3. Final Result (Dono ka Guna)
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
    void main() {
        Product_Except_Self obj = new Product_Except_Self();
        int[] nums = { 1, 2, 3, 4 };
        int[] result = obj.productExceptSelf(nums);
        // Print Result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

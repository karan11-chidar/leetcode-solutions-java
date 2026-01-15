package binary_search;

public class Find_Minimum_in_a_Roated_Sorted_Array {
    public int findMin(int[] nums) {
        // *********************Brute Force Solutions**********************/
        // int size = nums.length;
        // int ans = nums[0];
        // for(int i=1; i<size; i++){
        // if(ans>nums[i]){
        // ans = nums[i];
        // }
        // }
        // return ans;

        // ********************Optimization Solution*********************/
        int size = nums.length;
        // int ans = Integer.MAX_VALUE; // Sabse bada number le liya
        int low = 0;
        int high = size - 1;
        int ans = nums[0]; // Initialize answer variable
        while (low <= high) { // Standard loop
            int mid = low + (high - low) / 2;

            // Case 1: Agar mid bada hai high se, toh minimum Right mein hai
            if (nums[mid] > nums[high]) {
                // nums[mid] toh bada hai, ye answer nahi ho sakta
                low = mid + 1;
            }
            // Case 2: Agar mid chota ya barabar hai high se
            else {
                // Ye 'mid' hamara minimum HO SAKTA HAI!
                ans = nums[mid]; // Is Potential Candidate ko save karo
                high = mid - 1; // Ab piche jaakar dekho kya isse bhi chota kuch hai?
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Find_Minimum_in_a_Roated_Sorted_Array obj = new Find_Minimum_in_a_Roated_Sorted_Array();
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(obj.findMin(nums));
    }
}

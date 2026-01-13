public class Search_in_Roated_Sorted_Array {
    public int search(int[] nums, int target) {
        // *******************Brute-Force Solution************** */
        // int size = nums.length;
        // for(int i=0; i<size; i++){
        // if(nums[i]==target) return i;
        // }
        // return -1;

        // **********************Optimization Solution**********************/
        int size = nums.length;
        // Pointers
        int low = 0;
        int high = size - 1;
        // Traverse In Array
        while (low <= high) {
            // Calculate mid element
            int mid = (low + high) / 2;
            // Condition 1:- Mid element equl to target
            if (nums[mid] == target) {
                return mid;
            }
            // Condition 2:- Check Sorted Part Left Side
            else if (nums[low] <= nums[mid]) {
                // Condition 3:- check target is present in range
                if (nums[low] <= target && nums[mid] > target) {
                    high = mid - 1;
                }
                // Condition 4:- target not present toh shift right side
                else {
                    low = mid + 1;
                }
            }
            // Condition 4:- Check Right Side
            else {
                // Condition 5:-check target is present in range
                if (nums[mid] < target && nums[high] >= target) {
                    low = mid + 1;
                } else { // Condition 6:- target not present toh shiff left side
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Search_in_Roated_Sorted_Array obj = new Search_in_Roated_Sorted_Array();
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(obj.search(nums, target));
    }
}

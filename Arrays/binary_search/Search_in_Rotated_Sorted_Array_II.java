package binary_search;
public class Search_in_Rotated_Sorted_Array_II {
    public boolean search(int[] nums, int target) {
        // **************************Brute-Force Solution***************************/
        // int size = nums.length;
        // // Apn Normally linear search lagane wale hai
        // for(int i=0; i<size; i++){
        // // Ab apn check karenge ki target current element ke equal hai ya nahi
        // if(nums[i]==target){
        // // Agar hamara target equal hai toh return ture kar do
        // return true;
        // }
        // }
        // // agar hamara element target ke equal na ho toh return false kar do
        // return false;

        // *************************Optimization Solution********************** */
        int size = nums.length;
        int high = size - 1;
        int low = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Always use this for MNCs!

            if (nums[mid] == target)
                return true;

            // 1. SABSE PEHLE: Check Confusion (Duplicates)
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue; // Range choti ho gayi, ab agle round mein dekho
            }

            // 2. AB PURANA LOGIC: Left Side Sorted?
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // 3. Right Side Sorted?
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Search_in_Rotated_Sorted_Array_II obj = new Search_in_Rotated_Sorted_Array_II();
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 0;
        System.out.println(obj.search(nums, target));
    }
}

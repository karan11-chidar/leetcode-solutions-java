package binary_search;
public class searchinsertionposition {
    public int searchInsert(int[] nums, int target) {
        // // *********************Brute-Force Solution**********************//
        // int size = nums.length;
        // // Traverse Array
        // for(int i=0; i<size; i++){
        // // Check Condition Target is greter than equal
        // if(nums[i]>=target){
        // return i;
        // }
        // }
        // return size;

        // *************************Optimal Solution************************* */

        int size = nums.length;
        // Pointers
        int low = 0;
        int high = size - 1;
        // Traverse
        while (low <= high) {
            // Decision Varible
            int mid = (low + high) / 2;
            // check mid id equal to target
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
    public static void main(String[] args) {
        searchinsertionposition obj = new searchinsertionposition();
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(obj.searchInsert(nums, target));
    }
}

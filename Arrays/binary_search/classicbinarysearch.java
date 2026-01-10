package binarysearch;
public class classicbinarysearch {
    public int search(int[] nums, int target) {
        // *******************Brute-Force Solution***********************/

        // int size = nums.length;
        // // loop se traverse karke ek ek element ko check karenge
        // for(int i=0; i<size; i++){
        // //kya mera element target ke equal hai
        // if(nums[i]==target){
        // return i;
        // }
        // }
        // return -1;

        // *********************Optimal Solution**********************/
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
        return -1;
    }
    public static void main(String[] args) {
        classicbinarysearch obj = new classicbinarysearch();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(obj.search(nums, target));
    }
}

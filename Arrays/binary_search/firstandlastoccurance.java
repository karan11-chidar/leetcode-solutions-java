package binary_search;
public class firstandlastoccurance {

    public int[] searchRange(int[] nums, int target) {
        // *********************Brute-Force Solution******************************** */
        // int size = nums.length;
        // int first = -1;
        // int second = -1;
        // int arr[] = new int[2];
        // for(int i=0; i<size; i++){
        // if(nums[i]==target){
        // first = i;
        // break;
        // }
        // }
        // for(int i=size-1; i>=0; i--){
        // if(nums[i]==target){
        // second = i;
        // break;
        // }
        // }
        // arr[0] = first;
        // arr[1] = second;
        // return arr;

        // ***********************************Optimal
        // Solution*****************************************//
        int size = nums.length;
        // Store Answer
        int res[] = new int[2];
        // Base Case
        res[0] = -1;
        res[1] = -1;
        // Pointers
        int low = 0;
        int high = size - 1;
        // Find left first Position
        while (low <= high) {
            // Decision making varible
            int mid = (low + high) / 2;
            // check condition
            if (nums[mid] == target) {
                res[0] = mid;
                high = mid - 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        // Pointers
        low = 0;
        high = size - 1;
        // Find Right Second Position
        while (low <= high) {
            // Decision making varible
            int mid = (low + high) / 2;
            // check condition
            if (nums[mid] == target) {
                res[1] = mid;
                low = mid + 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return res;
    }
    void main() {
        firstandlastoccurance obj = new firstandlastoccurance();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] result = obj.searchRange(nums, target);
        System.out.println("First and Last Occurrence: [" + result[0] + ", " + result[1] + "]");
    }
}

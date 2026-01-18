package binary_search;

public class Find_Peak_Element_Array {
    public int findPeakElement(int[] nums) {
        //************************Brute-Force**************************************/
        // int size = nums.length;
        // for(int i=0; i<size-1; i++){
        //     if(nums[i]>nums[i+1]) return i;
        // }
        // return size-1;

        //************************Optimization Soltuion**************************** */
        int low = 0;
        int high = nums.length - 1;

        // Condition: Jab tak pointers ek hi jagah nahi mil jate
        while (low < high) {
            int mid = low + (high - low) / 2;

            // Uphill Logic: Agla kadam upar hai?
            if (nums[mid] < nums[mid + 1]) {
                // Peak pakka Right side mein hai
                low = mid + 1;
            }
            // Downhill Logic: Agla kadam niche hai ya barabar?
            else {
                // Ya toh mid peak hai, ya peak Left mein hai
                high = mid;
            }
        }

        // Jab loop rukega, low aur high dono Peak par honge
        return low;
    }
    public static void main(String[] args) {
        Find_Peak_Element_Array obj = new Find_Peak_Element_Array();
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println("Peak Element Index: " + obj.findPeakElement(nums));
    }
}

package prefixsum_And_sufixsum;

import java.util.HashMap;

public class SubarraySumDivisibleK {
    public int subarraysDivByK(int[] nums, int k) {
        int size = nums.length;
        // Counter
        int count = 0;
        // Sum store
        int sum = 0;
        // Map to history record of sum
        HashMap<Integer,Integer> map = new HashMap<>();
        // base case 
        map.put(0,1);
        // Traverse
        for(int i=0; i<size; i++){
            // Calculate Sum
            sum += nums[i];
            // Calculate Remainder
            int rem = ((sum%k)+k)%k;
            // Check remainder exit or not
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }

    void main() {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums,k));
    }
}

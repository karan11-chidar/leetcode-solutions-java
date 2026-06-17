package two_pointer;

import java.util.Arrays;

public class ThreeSumClosest {
    static void main() {
        int nums[] = {-1,2,1,-4};
        Arrays.sort(nums);
        int target = 1;
        int size = nums.length;
        int closestSum = nums[0]+nums[1]+nums[2];
        for(int i=1; i<size-2; i++){
            int left = i+1;
            int right = size-1;
            while(left<right){
                int currentSum = nums[i]+nums[left]+nums[right];
               if(Math.abs(currentSum-target)<Math.abs(closestSum-target)){
                   closestSum = currentSum;
               }
                if(currentSum==target){
                    System.out.println(currentSum);
                    return;
                }
                else if(currentSum<target){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        System.out.println(closestSum);
    }
}

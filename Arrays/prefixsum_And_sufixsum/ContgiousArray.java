package prefixsum_And_sufixsum;

import java.util.HashMap;

public class ContgiousArray {
     public int findMaxLength(int[] nums) {
//**********************Brute-Force Solution**********************/
    //     int size = nums.length;
    //     // Store maximum length
    //     int maxLength = 0;
    //     // Outer Loop
    //     for(int i=0; i<size; i++){
    //         // Count 0 and 1
    //         int count0 = 0;
    //         int count1 = 0;
    //         // Inner Loop
    //         for(int j=i; j<size; j++){
    //             if(nums[j]==0) count0++;
    //             else count1++;
    //             if(count0==count1) maxLength= Math.max(maxLength,(j-i)+1);
    //         }
    //     }
    //     return maxLength;
    // }

//*******************************Optimal Solution********************* */
    // 1. Map banao: Key = Sum, Value = Index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 2. Base Case: 0 sum index -1 par tha (start se pehle)
        map.put(0, -1);
        
        int sum = 0;
        int maxLen = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // 3. 0 ko -1 ki tarah treat karo
            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            
            // 4. Check karo: Kya ye sum pehle dekha hai?
            if (map.containsKey(sum)) {
                // Purana index nikaalo aur gap (length) calculate karo
                int oldIndex = map.get(sum);
                int currentLen = i - oldIndex;
                
                // Max length update karo
                maxLen = Math.max(maxLen, currentLen);
            } else {
                // 5. Agar naya sum hai, toh ise pehli baar waale index ke saath save kar lo
                map.put(sum, i);
            }
        }
        
        return maxLen;
    }
    void main() {
        ContgiousArray obj = new ContgiousArray();
        int[] nums = {0,1,0,1,0,0,1
        };
        int result = obj.findMaxLength(nums);
    }
}

package two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static void main() {
        int arr[] = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        int size = arr.length;
        List<List<Integer>>list = new ArrayList<>();
        for(int i = 0; i < size-2; i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int left = i+1;
            int right = size-1;
            while(left<right){
                int sum = arr[left]+arr[right];
                if((-(arr[i]))==sum){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[left]);
                    temp.add(arr[right]);
                    list.add(temp);
                    while(left<right && arr[left]==arr[left+1]){
                        left++;
                    }
                    while(left<right && arr[right]==arr[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum<(-arr[i])){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        System.out.println(list);
    }
}

package Random_Questions;

import java.util.HashMap;
import java.util.Scanner;

public class FindModeElementInArray {

    static int modeElement(int []nums){
        int size = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int maxFreq = -1;
        int maxKey = -1;
        for(int num:map.keySet()){
            int currentFreq = map.get(num);
            if(currentFreq > maxFreq){
                maxFreq = currentFreq;
                maxKey = num;
            }
        }
        return maxKey;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The mode is "+modeElement(arr));
    }
}

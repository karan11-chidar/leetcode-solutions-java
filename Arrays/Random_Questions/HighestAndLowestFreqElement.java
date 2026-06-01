package Random_Questions;

import java.util.HashMap;
import java.util.Scanner;

public class HighestAndLowestFreqElement {

    static int[] highestAndLowestFreqElement(int[] arr) {
        int size = arr.length;
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i=0; i<size; i++){
            res.put(arr[i],res.getOrDefault(arr[i],0)+1);
        }
        int maxFreq = Integer.MIN_VALUE;
        int maxFreqElement = 0;
        int lowFreq = Integer.MAX_VALUE;
        int lowFreqElement = 0;
        for(int num:res.keySet()){
            int currentFreq = res.get(num);
            if(currentFreq>maxFreq){
                maxFreq = currentFreq;
                maxFreqElement = num;
            }
            else if(currentFreq<lowFreq){
                lowFreq = num;
                lowFreqElement = num;
            }
        }
        return new int[]{maxFreqElement,lowFreqElement};
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size =  sc.nextInt();
        System.out.println("Enter the elements of the array");
        int nums[] = new int[size];
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int res[] = highestAndLowestFreqElement(nums);
        System.out.println("Highest Freq Element :-"+res[0] +"\nLowest Freq Element :-"+res[1]);
    }
}

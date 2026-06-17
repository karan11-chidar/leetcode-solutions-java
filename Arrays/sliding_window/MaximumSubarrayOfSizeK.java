package sliding_window;

public class MaximumSubarrayOfSizeK {
    static void main() {
        int[] arr = {10,20,40,50,30,20};
        int size = arr.length;
        int k = 3;
        int res = Integer.MIN_VALUE;
        int currentSum = 0;
        int i = 0;
        int j= 0;
        while(j<size){
            currentSum += arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                res = Math.max(res,currentSum);
                currentSum -= arr[i];
                j++;
                i++;
            }
        }
        System.out.println(res);
    }
}

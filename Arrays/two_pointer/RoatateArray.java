package two_pointer;

public class RoatateArray {
    static void main() {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        int size = nums.length;
        k  = k%size;
        reverse(nums,0,size-1);
        reverse(nums,0,k-1);
        reverse(nums,k,size-1);
    }
    static void reverse(int[]arr,int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

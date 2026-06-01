package Random_Questions;

public class MergeSortedArray {
    static void main() {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int left = 2;
        int right =2;
        int r = arr1.length-1;
        while (left >=0 && right>=0) {
            if (arr1[left] > arr2[right]) {
                arr1[r] = arr1[left];
                left--;
                r--;
            } else {
                arr1[r] = arr2[right];
                r--;
                right--;
            }
        }
        while(right>=0) {
            arr1[r]  = arr2[right];
            r--;
            right--;
        }
        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i] +" ");
        }
    }
}

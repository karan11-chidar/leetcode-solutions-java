package Random_Questions;

import java.util.Scanner;

public class PrintExtemeElement {

    static int[] printExtremeElement(int[] arr){
        int size = arr.length;
        int nums[] = new int[size];
        int j = 0;
        int left = 0;
        int right =size-1;
        while(left<=right){
            if(left==right){
                nums[j] = arr[left];
                left++;
            }
            else {
                nums[j] = arr[left];
                left++;
                j++;
                nums[j] = arr[right];
                right--;
                j++;
            }
        }
        return nums;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int res[] = printExtremeElement(arr);
        for (int k = 0; k < res.length; k++) {
            System.out.print(res[k] + " ");
        }
    }
}

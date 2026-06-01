package Random_Questions;

import java.util.Scanner;

public class MultiplyofArrayElement {

    static void multiply(int []nums){
        for(int i=0;i<nums.length;i++) {
            nums[i] = nums[i] * 10;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array :-");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
        }
        multiply(arr);
    }
}

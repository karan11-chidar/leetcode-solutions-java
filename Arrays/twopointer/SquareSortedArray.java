package twopointer;

import java.util.Scanner;

public class SquareSortedArray {
    static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = new int[n];
        int resultIndex = n-1;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int leftSquare = arr[left]*arr[left];
            int rightSquare = arr[right]*arr[right];
            if(leftSquare < rightSquare){
                res[resultIndex] = rightSquare;
                right--;
            }
            else {
                res[resultIndex] = leftSquare;
                left++;
            }
            resultIndex--;
        }
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }
}

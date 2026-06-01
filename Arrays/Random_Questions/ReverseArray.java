package Random_Questions;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {

    static void reverseArray(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            st.push(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = st.pop();
        }
    }

//    static void swap(int arr[],int left ,int right){
//        int temp = arr[left];
//        arr[left] = arr[right];
//        arr[right]= temp;
//    }
//    static void reverseArray(int[] arr){
//        int size = arr.length;
//        int left = 0;
//        int right = size-1;
//        while(left<=right){
//            swap(arr,left,right);
//            left++;
//            right--;
//        }
//    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
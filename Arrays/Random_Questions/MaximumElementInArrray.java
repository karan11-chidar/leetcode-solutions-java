package Random_Questions;

import java.util.Scanner;

public class MaximumElementInArrray {
    static int FindMaximumElementInArrray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maxium Element in Arrays :- "+FindMaximumElementInArrray(arr));
    }
}

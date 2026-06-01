package Random_Questions;

import java.util.Scanner;

public class ShiftArrayByOnePositon {

    static void shiftArrayByOnePositon(int[] arr) {
        int size = arr.length;
        int lastElement = arr[size - 1];
        for(int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        shiftArrayByOnePositon(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

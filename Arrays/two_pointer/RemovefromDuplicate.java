package two_pointer;

import java.util.Scanner;

public class RemovefromDuplicate {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int size = sc.nextInt();
        System.out.println("Enter the Array Elements : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int slow = 1;
        // Traverse Array
        for(int fast=1;fast<size;fast++) {
            if(arr[fast] != arr[fast-1]){
                arr[slow] = arr[fast];
                slow++;
            }
        }
        for(int i=0;i<slow;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

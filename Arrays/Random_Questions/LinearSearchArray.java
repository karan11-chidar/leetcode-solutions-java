package Random_Questions;

import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int search = input.nextInt();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==search){
                System.out.println("Element found at index : "+i);
            }
        }
    }
}

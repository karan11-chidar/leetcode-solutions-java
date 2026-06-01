package Random_Questions;

import java.util.Scanner;

public class SwapAlternateElements {
    static void swap(int []arr,int left,int right){
        int temp  = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j=j+2){
            swap(arr,j,j+1);
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

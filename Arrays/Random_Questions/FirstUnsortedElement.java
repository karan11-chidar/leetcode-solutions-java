package Random_Questions;

import java.util.Scanner;

public class FirstUnsortedElement {

    static int unSortedElement(int[] arr){
       int unSortedElement = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
              unSortedElement = arr[i];
               return unSortedElement;
            }
        }
       if(arr[arr.length-1]<arr[arr.length-2]){
         unSortedElement = arr[arr.length-1];
       }
        return unSortedElement ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Unsorted Element :- "+unSortedElement(arr));
    }
}

package Random_Questions;

import java.util.Scanner;

public class SumOfNegativeAndPositive {

    static int sumNegativeNumbers(int arr[]){
        int negativeSum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negativeSum+=arr[i];
            }
        }
        return negativeSum;
    }
    static int sumPositiveNumbers(int arr[]){
        int positiveSum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positiveSum+=arr[i];
            }
        }
        return positiveSum;
    }
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Negative numbers in the array :- "+sumNegativeNumbers(arr));
        System.out.println("Postive numbers in the array :- "+sumPositiveNumbers(arr));
    }
}

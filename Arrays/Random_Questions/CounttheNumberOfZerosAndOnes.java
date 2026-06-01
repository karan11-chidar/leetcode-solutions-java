package Random_Questions;

import java.util.Scanner;

public class CounttheNumberOfZerosAndOnes {
    static int countZeros(int []arr){
        int zero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
        }
        return zero;
    }
    static int countOne(int[] arr){
        int one = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                one++;
            }
        }
        return one;
    }
    static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Count Zeros in Arrays :- "+countZeros(arr));
        System.out.println("Count One in Arrays :- "+countOne(arr));
    }
}

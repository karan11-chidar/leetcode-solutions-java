package Random_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class AlternateExtremeElement {

    static int[] alternateSwap(int arr[]){
        int num[] = new int[arr.length];
        int j = 0;
        for(int i=0;i<arr.length;i++){
                num[j] = arr[i];
                j +=2;
        }
        j = 1;
        for(int k=arr.length-1;k>=1; k-=2){
            num[j] = arr[k];
            j +=2;
        }
        return num;
    }
    public static void main(String[]args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int res[] = alternateSwap(arr);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }

    }
}

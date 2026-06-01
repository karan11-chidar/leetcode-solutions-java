package Random_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionArrrays {
    static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        ArrayList<Integer> li =  new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    li.add(arr1[i]);
                }
            }
        }
        return li;
    }
    public  static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array 1:- ");
        int size1=sc.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the array 2:- ");
        int size2=sc.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("InterSection of Arrays :- "+intersection(arr1,arr2));
    }
}

package Random_Questions;

import java.util.Scanner;

public class RemoveDuplicates {
    static int[] removeDuplicates(int[] arr) {
        int[] res =  new int[arr.length];
        int len = arr.length;
        if (len == 0) {
            return arr;
        }
        int slow = 1;
        int fast = 1;
        while (fast < len) {
            if (arr[slow] != arr[fast]) {
                res[slow-1] = arr[fast];
                slow++;
            }
            fast++;
        }
        return res;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = removeDuplicates(arr);
        for(int k = 0; k < res.length; k++){
            System.out.print(res[k] + " ");
        }
    }
}

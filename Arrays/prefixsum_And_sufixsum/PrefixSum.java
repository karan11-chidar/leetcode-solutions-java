package prefixsum_And_sufixsum;

import java.util.Scanner;

public class PrefixSum {
    void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Element :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int prefix[] = new int[size];
        prefix[0] = arr[0];
        for (int i = 1; i < size; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}

package prefixsum_And_sufixsum;
import java.util.*;

public class SuffixSum {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Element :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int suffix[] = new int[size];
        suffix[size-1] = arr[size-1];
        for (int i=size-2; i >= 0; i--) {
            suffix[i] = arr[i] + suffix[i + 1];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(suffix[i] + " ");
        }
        sc.close();
    }
}


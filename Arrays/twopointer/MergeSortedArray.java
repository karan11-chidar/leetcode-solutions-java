package twopointer;
import java.util.*;
public class MergeSortedArray {
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter One Size of Array :- ");
//        int m = sc.nextInt();
//        int[] nums1 = new int[m];
//        System.out.println("Enter One Array Elements :- ");
//        for(int i=0; i<m; i++){
//            nums1[i] = sc.nextInt();
//        }
//        System.out.println("Enter Second Size of Array :- ");
//        int n = sc.nextInt();
//        int[] nums2 = new int[n];
//        System.out.println("Enter First Array Elements :- ");
//        for(int i=0; i<n; i++){
//            nums2[i] = sc.nextInt();
//        }

        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {4,5,6};
        // Pointers
        int p1 = 2;
        int p2 = 2;
        int p3 = nums1.length-1;

        // Traverse Array
        while(p1>=0 && p2>=0){
            if(nums1[p1] < nums2[p2]){
                nums1[p3] = nums2[p2];
                p2--;
            }
            else {
                nums1[p3] = nums1[p1];
                p1--;
            }
            p3--;
        }
        while(p2>=0){
            nums1[p3] = nums2[p2];
            p3--;
            p2--;
        }
        for(int i=0; i<nums1.length; i++){
            System.out.println(nums1[i]);
        }
    }
}

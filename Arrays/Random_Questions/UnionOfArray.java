package Random_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UnionOfArray {
    static ArrayList<Integer> unionOfArray(int[]nums1,int[]nums2){
        ArrayList<Integer> res = new  ArrayList<>();
        int size1 =  nums1.length;
        int size2 =  nums2.length;
        int left = 0;
        int right = 0;
        while(left<size1 && right<size2){
            if(nums1[left]<nums2[right]){
                if (res.isEmpty() || res.get(res.size() - 1) != nums1[left]) {
                    res.add(nums1[left]);
                }
                left++;
            }
            else if(nums1[left]>nums2[right]){
                if (res.isEmpty() || res.get(res.size() - 1) != nums2[right]) {
                    res.add(nums2[right]);
                }
                right++;
            }
            else if(nums1[left]==nums2[right]){
                if (res.isEmpty() || res.get(res.size() - 1) != nums1[left]) {
                    res.add(nums1[left]);
                }
                left++;
                right++;
            }
        }
        while(left<size1){
            if (res.isEmpty() || res.get(res.size() - 1) != nums1[left]) {
                res.add(nums1[left]);
            }
            left++;
        }
        while(right<size2){
            if (res.isEmpty() || res.get(res.size() - 1) != nums2[right]) {
                res.add(nums2[right]);
            }
          right++;
        }

        return res;
    }
    static void main() {
       int arr1[] = {1,2,3,4,5,6,7,8,2,2};
       int arr2[] = {3,5,6,7};
       ArrayList<Integer> result = unionOfArray(arr1,arr2);
        System.out.println(result);

    }
}

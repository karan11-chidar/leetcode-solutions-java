package Random_Questions;

import java.util.Scanner;

public class SquareSortedArray {
    static void main() {
       int  arr[] = {-4,-1,0,3,10};
       int n = arr.length;
       int left = 0;
       int right = n-1;
      int res[] = new int[n];
      int r = n-1;
      while (left <= right) {
          int leftSqure = arr[left] * arr[left];
          int rightSqure = arr[right] * arr[right];
          if(leftSqure < rightSqure) {
              res[r] =  rightSqure;
              right--;
              r--;
          }
          else {
              res[r] =  leftSqure;
              left++;
              r--;
          }
      }
      for (int i = 0; i < n; i++) {
          System.out.print(res[i] + " ");
      }
    }
}

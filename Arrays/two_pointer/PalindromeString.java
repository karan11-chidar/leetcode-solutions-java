package two_pointer;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int size = str.length();
        int left = 0;
        int right = size - 1;
        boolean isFlag = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                if (isPalindrome(str, left+1, right )) {
                    System.out.println("Yes, it can be a palindrome by removing one character.");
                    break;
                } else if (isPalindrome(str, left, right - 1)) {
                    System.out.println("Yes, it can be a palindrome by removing one character.");
                    break;
                } else {
                    isFlag = false;
                    System.out.println("No, it cannot be a palindrome by removing one character.");
                }
            }
            left++;
            right--;
        }
        if (isFlag) {
            System.out.println("Yes, it is already a palindrome.");
        }
    }

    public static boolean isPalindrome(String str, int left, int right) {

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

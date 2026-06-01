package Random_Questions;

import java.util.Scanner;

public class PalindromeString {

    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char ch1 = str.charAt(left);
            char ch2 = str.charAt(right);
            if(ch1 != ch2) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println(str);
    }
}

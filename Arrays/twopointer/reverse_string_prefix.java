package twopointer;

public class reverse_string_prefix {
    public String reversePrefix(String s, int k) {
        char ch[] = s.toCharArray();
        // Pointers
        int left = 0;
        int right = k - 1;
        while (left < right) {
            // Temp Store
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        String res = String.valueOf(ch);
        return res;
    }
    public static void main(String[] args) {
        reverse_string_prefix obj = new reverse_string_prefix();
        String s = "abcdefd";
        int k = 4;
        System.out.println(obj.reversePrefix(s, k));
    }
}

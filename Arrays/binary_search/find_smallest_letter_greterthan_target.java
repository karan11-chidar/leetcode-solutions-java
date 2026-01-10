package binary_search;

public class find_smallest_letter_greterthan_target {
    public char nextGreatestLetter(char[] letters, char target) {
        int size = letters.length;
        int low = 0;
        int high = size - 1;
        char result = letters[0]; // Default result is the first letter

        while (low <= high) {
            int mid = (low + high) / 2;
            if (letters[mid] > target) {
                result = letters[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
package binary_search;

public class Sqrt {
    public int mySqrt(int x) {
        // Base Case
        if (x == 0 || x == 1)
            return x;
        // Pointers
        int low = 1;
        int high = x;
        // Store Answer
        int ans = 0;
        while (low <= high) {
            // Decision varible
            int mid = (low + high) / 2;
            // Codition check ki x is equl or less than
            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Sqrt obj = new Sqrt();
        int x = 8;
        System.out.println(obj.mySqrt(x));
    }
    
}

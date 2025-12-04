package slidingwindow;

class VariableSizeLongestArray {
    public int longestSubarray(int[] arr, int k) {
        int size = arr.length;
        int max = 0;
        int sum = 0;
        int i = 0;
        int j = 0;

        while (j < size) {

            // 1. Expand (Hamesha karo)
            sum = sum + arr[j];

            // 2. Shrink (Agar condition kharab hai)
            // Note: Hum sirf tab tak shrink karenge jab tak sum > k hai
            while (sum > k) {
                sum = sum - arr[i];
                i++;
            }

            // 3. Answer Check (Shrink hone ke baad check karo)
            // Note: Maine 'else if' hata diya. Ab ye hamesha check hoga.
            if (sum == k) {
                max = Math.max(max, j - i + 1);
            }

            // 4. Aage badho
            j++;
        }
        return max;
    }

    void main() {
        VariableSizeLongestArray vla = new VariableSizeLongestArray();
        int[] arr = { 4, 1, 1, 1, 2, 3, 5 };
        int k = 5;
        int result = vla.longestSubarray(arr, k);
        System.out.println(result);
    }
}
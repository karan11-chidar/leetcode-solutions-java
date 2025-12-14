package kadanesalgorithum;

public class ConcatenationMaximumSum {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int n = arr.length;
        long MOD = 1000000007; // Question ki demand (Rule)

        // Step 1: Agar sirf 1 copy hai, toh simple Kadane chalao
        if (k == 1) {
            return (int) (kadane(arr) % MOD);
        }

        // Step 2: Array ka Total Sum nikalo
        long totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Step 3: "2 Copies" wala array banao (Joint check karne ke liye)
        int[] twoCopies = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            // Logic: i % n se hum array ko repeat kar rahe hain
            twoCopies[i] = arr[i % n];
        }

        // Step 4: 2 Copies par Kadane chalao (Best Joint/Corner nikalne ke liye)
        long twoCopiesSum = kadane(twoCopies);

        // Step 5: DECISION TIME (Tumhara Logic)

        // Case A: Agar Total Sum POSITIVE hai -> Highway Banao
        if (totalSum > 0) {
            // Formula: (Corner ka Best) + (Beech ke bache hue copies * Total Sum)
            long result = twoCopiesSum + ((k - 2) * totalSum);
            return (int) (result % MOD);
        }
        // Case B: Agar Total Sum NEGATIVE hai -> Sirf Bridge (Joint) rakho
        else {
            // Formula: Sirf 2 copies ka result kaafi hai
            return (int) (twoCopiesSum % MOD);
        }
    }

    void main() {
        ConcatenationMaximumSum obj = new ConcatenationMaximumSum();
        int[] arr = { 1, -2, 1 };
        int k = 5;
        int result = obj.kConcatenationMaxSum(arr, k);
        System.out.println("The Maximum Subarray Sum after " + k + " concatenations is: " + result);
    }
    private long kadane(int[] arr) {
        long maxSoFar = Long.MIN_VALUE;
        long maxEndingHere = 0;

        for (int num : arr) {
            maxEndingHere += num;
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }
}

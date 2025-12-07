package slidingwindow;

public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int size = customers.length;
        // Total Satisfied custoumers
        int totalSafe = 0;
        for (int i = 0; i < grumpy.length; i++) {
            // Agar customers already khus hai toh usse add karo
            if (grumpy[i] == 0) {
                // Add totall safe
                totalSafe += customers[i];
            }
        }
        // Maximum Saved
        int maxSaved = Integer.MIN_VALUE;
        // Window sum
        int windowSum = 0;
        // Pointers
        int k = 0;
        int j = 0;
        // Traverse
        while (j < size) {
            // Agar hamare customer unsatisfied hai
            if (grumpy[j] == 1) {
                // Calculate window sum
                windowSum += customers[j];
            }
            // window badhao
            if (j - k + 1 < minutes) {
                j++;
            }
            // window complete
            else if (j - k + 1 == minutes) {
                // Calculate maxSum
                maxSaved = Math.max(maxSaved, windowSum);
                // slide window
                // Agar customers unsatisfied hai toh hi sum se -- karo
                if (grumpy[k] == 1) {
                    windowSum -= customers[k];
                }
                k++;
                j++;
            }
        }
        return totalSafe + maxSaved;
    }

    void main() {
        GrumpyBookstoreOwner gbo = new GrumpyBookstoreOwner();
        int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
        int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
        int minutes = 3;
        int result = gbo.maxSatisfied(customers, grumpy, minutes);
        System.out.println(result);
    }
}

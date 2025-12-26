package prefixsum_And_sufixsum;

public class FindMaximumAltitude {
    public int largestAltitude(int[] gain) {
        int size = gain.length;
        // Store Maximum Altiude
        int maxAltitude = 0;
        // Current Altitude
        int currentAltitude = 0;
        // Traverse Loop
        for (int i = 0; i < size; i++) {
            // Calculate Prefix Sum
            currentAltitude += gain[i];
            // Update Maximum Altitude
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }
        return maxAltitude;
    }
    void main() {
        FindMaximumAltitude obj = new FindMaximumAltitude();
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(obj.largestAltitude(gain));
    }
}

package binary_search;

public class bad_version extends VersionControl {
    public boolean isBadVersion(int version) {
        return super.isBadVersion(version);
    }
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            // Safe Mid calculation (Overflow proof)
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                // Agar mid kharab hai, toh ho sakta hai ye pehla ho,
                // ya isse pehle aur bhi hon.
                // Isliye hum Left side dhoondenge, par mid ko bhi range mein rakhenge.
                right = mid;
            } else {
                // Agar mid sahi hai, toh kharabi pakka iske baad hui hai.
                // Mid ko chhod do, aage badho.
                left = mid + 1;
            }
        }
        // Loop tab tutega jab left == right hoga, wahi humara answer hai.
        return left;
    }
}
// Simulated VersionControl class for demonstration purposes
class VersionControl {
    // Simulated method to check if a version is bad
    boolean isBadVersion(int version) {
        int firstBadVersion = 4; // Example: Let's say version 4 and onwards are bad
        return version >= firstBadVersion;
    }
}   


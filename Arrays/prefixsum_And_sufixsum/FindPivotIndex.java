
package prefixsum_And_sufixsum;
import java.util.*;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int size = nums.length;
        // Traverse Array
        // Outer Loop
        for (int i = 0; i < size; i++) {
            // Left Sum
            int leftSum = 0;
            // Right Sum
            int rightSum = 0;
            // Innerr LeftSum calculate
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            // Inner RightSum calculate
            for (int k = i + 1; k < size; k++) {
                rightSum += nums[k];
            }
            // Check LeftSum Is equal To rightSum
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
    void main() {
        FindPivotIndex obj = new FindPivotIndex();
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        int pivotIndex = obj.pivotIndex(arr);
        System.out.println("Pivot Index is : " + pivotIndex);
    }
}

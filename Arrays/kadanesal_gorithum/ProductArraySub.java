package kadanesal_gorithum;

public class ProductArraySub {
    static void main() {
        int arr[] = {-2, 6, -3, -10, 0, 2};
        int size = arr.length;
        int maxSum = arr[0];
        int minSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < size; i++) {
            currentSum *= arr[i];
            maxSum = Math.max(maxSum, currentSum);
            minSum = Math.min(minSum, currentSum);
        }
        System.out.println(maxSum);
    }
}

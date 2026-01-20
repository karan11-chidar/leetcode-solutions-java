package binary_search;

import java.util.Scanner;

public class Minimize_the_Maximum_Load {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;

        // 1. Range Set Karna (Low aur High)
        for (int num : nums) {
            low = Math.max(low, num); // Sabse badi book (Max element)
            high += num; // Saari books ka sum
        }

        int ans = high;

        // 2. Binary Search on Answer
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // 3. Librarian Test (Check Function)
            if (isPossible(nums, k, mid)) {
                ans = mid; // Potential answer mil gaya!
                high = mid - 1; // Aur chota answer dhoondo (Left side)
            } else {
                low = mid + 1; // Limit badhao (Right side)
            }
        }
        return ans;
    }

    // 4. Engine: Is it possible to divide with this limit?
    private boolean isPossible(int[] nums, int k, int limit) {
        int studentCount = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num <= limit) {
                currentSum += num;
            } else {
                studentCount++;
                currentSum = num;
            }
        }
        return studentCount <= k;
    }

    public static void main(String args[]) {
        Minimize_the_Maximum_Load maximum_Load = new Minimize_the_Maximum_Load();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Books");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Pages of Books : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter of Students :");
        int k = sc.nextInt();
        maximum_Load.splitArray(arr, k);
    }
}

package twopointer;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumMatchingTrainers {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        // Sorting
        Arrays.sort(players);
        Arrays.sort(trainers);
        int sizePlayers = players.length;
        int sizeTrainers = trainers.length;
        // Pointers
        int playersIndex = 0;
        int trainersIndex = 0;
        // Counter to satisfy players
        int count = 0;
        // Loop Condition
        while (playersIndex < sizePlayers && trainersIndex < sizeTrainers) {
            // Check trainers capacity is greter or equal to players
            if (trainers[trainersIndex] >= players[playersIndex]) {
                count++;
                playersIndex++;
                trainersIndex++;
            } else {
                trainersIndex++;
            }
        }
        return count;
    }
    void main() {
        MaximumMatchingTrainers obj = new MaximumMatchingTrainers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int n = sc.nextInt();
        int[] players = new int[n];
        System.out.println("Enter the skill levels of players:");
        for (int i = 0; i < n; i++) {
            players[i] = sc.nextInt();
        }
        System.out.println("Enter the number of trainers:");
        int m = sc.nextInt();
        int[] trainers = new int[m];
        System.out.println("Enter the capacities of trainers:");
        for (int i = 0; i < m; i++) {
            trainers[i] = sc.nextInt();
        }
        int result = obj.matchPlayersAndTrainers(players, trainers);
        System.out.println("The maximum number of players that can be matched with trainers is: "
                + result);
        sc.close();
    }
}

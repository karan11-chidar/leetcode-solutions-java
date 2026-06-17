package two_pointer;
import java.util.Scanner;
import java.util.Arrays;
public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int size = people.length;
        int left = 0;
        int right = size-1;
        int boats = 0;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
                boats++;
                right--;
            }
            else {
                right--;
                boats++;
            }
        }
        return boats;
    }
}

package Random_Questions;
import java.util.*;
public class AverageOfArray {

    static int getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int  size = sc.nextInt();
        int []arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Average of array is : "+getAverage(arr));
    }
}

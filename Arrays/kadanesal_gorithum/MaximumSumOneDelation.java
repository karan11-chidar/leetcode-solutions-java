package kadanesal_gorithum;

public class MaximumSumOneDelation {
    static void main() {
        int arr[] = {10,-2,10,-100,20,-6,20};
        int size = arr.length;
        int removeSum = 0;
        int resultSum = arr[0];
        int currentSum =  arr[0];
        for(int i=1; i<size; i++){
            removeSum = Math.max(removeSum+arr[i],currentSum);
            currentSum = Math.max(currentSum+arr[i],arr[i]);
            int currentMaxSum = Math.max(currentSum,removeSum);
            resultSum = Math.max(resultSum,currentMaxSum);
        }
        System.out.println(resultSum);
    }
}

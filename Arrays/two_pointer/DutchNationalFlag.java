import java.util.Scanner;

public class DutchNationalFlag {
public static void main(String[] args) {
    DutchNationalFlag obj = new DutchNationalFlag();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of Array :- ");
    int size=sc.nextInt();
    System.out.println("Enter the element of Array (0s,1s & 2s):- ");
    int[] arr = new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    int low = 0;
    int mid = 0;
    int high = size-1;
    while(mid<=high){
        if(arr[mid]==0){
          obj.swap(mid,low,arr);
          low++;
          mid++;
        }
        else if(arr[mid]==2){
            obj.swap(mid,high,arr);
            high--;
        }
        else {
            mid++;
        }
    }
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
}
 static void swap(int a, int b, int[] arr){
    int temp =  arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
}

import java.util.Scanner;

public class LeftRoatatebyOne {
    void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        System.out.println("Enter Element of Array");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int temp = arr[0];
        for(int i=0;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = temp;
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}

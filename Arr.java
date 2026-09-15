
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        // this is the way to declare and initialize an array in java
       // int[] arr = {1, 2, 3, 4, 5};
       // System.out.println(arr.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] b= new int[n];
        for(int i=0;i<n;i++){
           // System.out.println("enter the value of array");
            b[i]=sc.nextInt();
        }
        System.out.println("the elements of array are");
        for(int i=0;i<n;i++){
            System.out.print("["+b[i]+"]");
        }
    }
}
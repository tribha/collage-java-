import java.util.*;
public class reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the elements of array");
            arr[i]=sc.nextInt();
        }
        System.out.println("the original array is ::"+Arrays.toString(arr));
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("the reversed array is ::"+Arrays.toString(arr));
    }
}
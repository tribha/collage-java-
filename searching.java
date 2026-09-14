import java.util.*;
public class searching{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the array size ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the elements of array");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int key=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("the element is found at index  ::"+i);
                //return;
                flag=1;
                break;
            }
        } if(flag==0){
        System.out.println("the element is not found"); 
        }
    }
}

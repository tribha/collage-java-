import java.util.*;
public class binary{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the array size ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the elements of array");
            arr[i]=sc.nextInt();
            if(i>0 && arr[i]<arr[i-1]){
                System.out.println("please enter the elements in sorted order");
                i--;
            }
        }
        System.out.println("enter the element to be searched");
        int key=sc.nextInt();
        int flag=0;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("the element is found at index  ::"+mid);
                flag=1;
                break;
            }else if(arr[mid]<key){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(flag==0){
            System.out.println("the element is not found"); 
        }
    }
}
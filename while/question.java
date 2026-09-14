import java.util.*;
public class question{
    public static void main(String[]arr){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the digits ");
        int n=sc.nextInt();
        int sum=0; 
        // while(n!=0){
           
        //     int r=n%10;
        //     sum=sum+r;
        //     n=n/10;
        // }
        // for(int i=0;i<=n;i++){
        //     int r=n%10;
        //     sum=sum+r;
        //     n=n/10;
        // }
        do{
           
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }while(n!=0);
        
      System.out.println(sum);
      
    }
}

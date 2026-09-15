import java.util.*;
public class sumofinput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1 digit you want to sum");
        int n=sc.nextInt();
        //  System.out.println("enter the 2 digit you want to sum");
        // int s=sc.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("the sum of the digits is ::"+sum);  
       
}
}
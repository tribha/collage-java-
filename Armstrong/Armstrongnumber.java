import java.util.*;
public class Armstrongnumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check armstrong or not");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("the number is armstrong");
        }else{
            System.out.println("the number is not armstrong");
        }
    }
}
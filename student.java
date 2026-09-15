import java.util.*;
public class student{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

         int n=1;
        while(n!=0){
            System.out.println("enter the name of user");
            String name=sc.nextLine();
            System.out.println("enter the age of user");
            int age=sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.println("enter the email of user");
            String email=sc.nextLine();
            
            System.out.println("User Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Email: " + email);
            System.out.println("-----------------------");
            
            System.out.println("If you want to stop, press 0");
            int d=sc.nextInt();
            sc.nextLine(); 
             n=d;
        }
        
    }

}
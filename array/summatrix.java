import java.util.*;
public class summatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row size ");
        int r=sc.nextInt();
        System.out.println("enter the column size ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("enter the elements of array");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the original array is ::"+Arrays.deepToString(arr));
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println("the sum of the matrix is ::"+sum);
    }
}
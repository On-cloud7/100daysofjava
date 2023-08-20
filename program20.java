import java.util.Scanner;

public class program20{
    public static void main(String[]args){
        int i,j,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n :");
            n= sc.nextInt();
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
            System.out.print(" ");
            }
            for(j=1;j<=i;j++){
            System.out.print("*");
            }
  System.out.println();
        }
    }
}
import java.util.Scanner;

public class program21 {
    public static void main(String[]args){
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of * in largest line:");
        n =sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print("");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    
}

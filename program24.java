import java.util.Scanner;
public class program24 {
 public static void main(String[]args){
    int i,j,n,k;
    Scanner sc =new Scanner (System.in);
    System.out.println("enter no of lines");
     n=sc.nextInt();
     for(i=1,k=1;i<=n;i++){
         for(j=1;j<=i;j++,k++){
            System.out.print(k+" ");
         }
         System.out.println();
     }
 }
    
}

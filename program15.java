import java.util.Scanner;
public class program15{
    public static void main(String[]args){
        int i,n ,fact=1;
        float sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        n =sc.nextInt();
        for(i=1;i<=n;i++){
            fact= fact*i ;
            sum =sum+0.1f/fact;


        }
        System.out.println(sum);
    }
}
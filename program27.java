import java.util.Scanner;
public class program27 {// find sum of all digits
    public static void main(String[]args){
        int sum =0,n;
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter value of n:");
            n=sc.nextInt();
        }
        while (n!=0) {
            sum +=n%10;
            n/=10;
            
        }
        System.out.println("sum ="+ sum);

    }
    
}

import java.util.Scanner;
public class program30 {// prime no
    public static void main(String[] args) {
        int i=2,n;
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println(" Enter the value of n");
            n=sc.nextInt();
        }
        while (n%i!=0) {
            i++;
            
        }
        if (n==i) {
            System.out.println(" prime number");
            
        } else {
            System.out.println(" not a prime number");
            
        }
    }
    
}

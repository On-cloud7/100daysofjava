import java.util.Scanner;
public class program55 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the num");
            int num = sc.nextInt();
            int rev =0;
            while(num>0){
                int rem = num%10;
                rev = rev*10 + rem;
                num = num/10;
                
            } 
            num = rev;
            System.out.println(" reverse number "+ num);
        }
    }
    
}

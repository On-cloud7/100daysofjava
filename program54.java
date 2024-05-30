import java.util.Scanner;

public class program54 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter the num:");
        int num = sc.nextInt();
        int count = 0;
        while(num >0){
            int rem = num%10;
            count++;
            System.out.println(rem);
            num =num/10;
        }
         System.out.println(" no of digits "+count);
        
    }
}

import java.util.Scanner;
public class program53 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println(" Enter num1 :");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2:");
            int num2 = sc.nextInt();
            System.out.println(" before swap num1 "+" "+ num1 + "num2 "+" "+num2);
            num1 = num1 + num2;
            num2 =num1 - num2;
            num1 = num1 -num2;
            System.out.println(" After  swap num1 "+" "+ num1 + "num2 "+" " +num2);
        }

    }
    
}

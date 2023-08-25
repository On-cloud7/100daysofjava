import java.util.Scanner;
public class program29{ // check divisibility
    public static void main(String[] args) {
        int sum=0,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Enter value of n");
            n =sc.nextInt();
        }
        if (n%10==0) {
            System.out.println(" Divisible by 10");
            
        } else {
            System.out.println(" Not divisible ");
            
        }

    }
}
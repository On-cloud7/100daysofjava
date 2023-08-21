import java.util.Scanner;
public class program26 {
    public static void main(String[]args){
        int i,n;
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter value of n:");
            n =sc.nextInt();
        }
        i=1;
        do {
            System.out.println(i);
            i++;
        } while (i<=n);
    }
}

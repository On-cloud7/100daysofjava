import java.util.Scanner;
public class program25{// while loop
    public static void main(String[]args){
        int i,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n:");
            n =sc.nextInt();
        }
        i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
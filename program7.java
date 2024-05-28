import java.util.Scanner;// calculate the largest number
public class program7
 {
    public static void main(String[]args){
        int a,b,large;
        System.out.println("Enter two numbers");
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b= sc.nextInt();
        }
        large=(a>b)?a:b;
        System.out.println("The largest value is" + large);

    }
}

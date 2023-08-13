/*write a program to calculate the simple interest taking principal , rate of interest
 and number of year as input as user.  */
 
import java.util.Scanner;
public class program5{
    public static void main(String[]args){
        int a, b, c , res;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Enter principal amount , rate of interest, no of years");
            a = (int) sc.nextFloat();
            b=(int) sc.nextFloat();
            c = (int) sc.nextFloat();
        }
        res =a*b*c/100;
        System.out.println("The simple interest is " + res);


    }
} 
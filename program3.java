// write a program to accept a number and display sqaure.
import java.util.Scanner;
public class program3{
   
    public static void main(String[]args){
    int i , res;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter integer");
        i = sc.nextInt();
    }
    res=i*i;
    System.out.println("the square is " + res);
   }

}
    


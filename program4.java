// write a program to accept two integers and display their product.

import java.util.Scanner;
public class program4 {
    public static void main(String[] args){
        int a,b , res;
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter two integers");
            a= sc.nextInt();
            b=sc.nextInt();
        }
        res = a*b;
        System.out.println(" the product of two integers is\n " + res );


    }
    
}

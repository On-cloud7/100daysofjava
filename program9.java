// write a program to swap two numbers.

import java.util.Scanner;
public class program9 {
    public static void main(String[]args){
        int a,b, temp;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two integers");
            a=sc.nextInt();
            b = sc.nextInt();
        }
        System.out.println("before swapping "+a +" " +b);
        temp =a;
        a=b;
        b=temp;
        System.out.println("After swapping "+a +" " +b);



    }
    
}

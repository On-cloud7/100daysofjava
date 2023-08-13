/*  write a program to accept the length and breadth of a rectangle from the user .
Calculate and display the area  and perimeter */

import java.util.Scanner;
public class program6 {
    public static void main(String[]args){
        int l, b, Area ,  Perimeter;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter length and breadth of rectangle");
            l =  (int)sc.nextFloat();
            b =  (int)sc.nextFloat();
        }
        Area =(l+b);
        Perimeter = 2*(l+b);
        System.out.println(" The area of rectangle is " + Area + " "+" and the perimeter is " +Perimeter); 

    }
    
}

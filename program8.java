// write a program to find radius of circle.
import java.util.Scanner;
public class program8 {
    public static void main(String[]args){
        float r, Area;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of radius ");
            r= sc.nextFloat();
        }
        Area = 3.14f*r*r;
        System.out.println(" The radius is" + Area );

    }
    
}

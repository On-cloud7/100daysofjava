// calculate and display sum of even nos
import java.util.Scanner;
public class program12 {
    public static void main(String[]args){
        int i,n,sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Enter value of n");
            n=sc.nextInt();
        }
        for(i=2;i<=2*n;  i+=2){
            System.out.println(i);
        }
    }
    
}

import java.util.Scanner;
public class program28 {// program to count the nos  of digits in a user entered no
    public static void main(String[]args){
        int count=0, n;
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter value of n:");
            n =sc.nextInt();
        }
        while (n!=0) {
         
            n/= 10;
            count++;
                        

                        

                        

            
        
        }    
    
        System.out.println(count);
    }
    
}

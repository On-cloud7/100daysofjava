import java.util.Scanner; 
public class program50 {
    public static void main(String[]args){
        System.out.println(" Enter the number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num %2 != 0){
                System.out.println(" it is a odd number ");

            }
            else{
                System.out.println(" it is a even number ");
            }
        }
    }
    
}

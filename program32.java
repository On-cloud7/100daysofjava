import java.util.Scanner;
public class program32 {// leap year
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter values: ");
        year = sc.nextInt();
        if (year%4==0 && year%100!=0 || year%100 ==0 && year%400==0) {
            System.out.println(" ITS A LEAP YEAR ");
            
        } else {
            System.out.println(" NOT A LEAP YEAR");
            
        }
    }
}

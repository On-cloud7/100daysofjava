import java.util.Scanner ;
public class program51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number 1:");
        int num1 = sc.nextInt();
        System.out.println(" Enter the number 2:");
        int num2 = sc.nextInt();
        System.out.println(" + , - , * , /");
        char ch = sc.next().charAt(0);
        switch (ch ){
            
            case ('+'): System.out.println("Add :"+ (num1+num2));
            break;
            case ('-'): System.out.println("Subtract :"+ (num1-num2));
            break;
            case ('*'): System.out.println("Multiply :"+ (num1*num2));
            break;
            case ('/'): System.out.println("Divide :"+ (num1/num2));
            break;
            default:System.out.println("End");
        }
    }
}

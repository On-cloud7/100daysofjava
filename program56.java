import java.util.Scanner;
public class program56 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner (System.in)) {
        System.out.println(" enter the number:");
        int num = sc.nextInt();
        int sum=0;
        int temp =num;
        while(num >0){
            int digit = num%10;
            sum = sum + (digit*digit*digit);
            num = num/10;
        }
        if(temp ==sum ){
            System.out.println(" the number is armstrong number");
        }
        else {
            System.out.println(" it is not a amstrong number ");
        }
    }
    }
    
}

import java.util.Scanner ;
public class program52 {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your  name :");
        String myname = sc.next();
        System.out.println("Enter your lover name :");
        String lovername = sc.next();
        int percentage = (int)((Math.random())*100);
        System.out.println("your lover "+lovername +" " +"loves you "+ "%"+ percentage);
    }
}

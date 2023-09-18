import java.util.Scanner;
class Euclid{
    private int n1,n2,gcd;
    public void accept(int x,int y){
        n1=x;
        n2=y;
    }
    public void calculate(){
       int temp;
       while(n1%n2!=0){
        n1=n1%n2;
        temp=n1;
        n1=n2;
        n2=temp;

       }
       gcd=n2;


    }
    public void display(){
        System.out.println("GCD:"+gcd);

    }
}
public class program39{
    public static void main(String[] args) {
        int x,y;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two values");
            x=sc.nextInt();
            y=sc.nextInt();
        }
        Euclid e= new Euclid();
        e.accept(x, y);
        e.calculate();
        e.display();

    }
}

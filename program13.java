import java.util.Scanner;// fibonacci
public class program13{
    public static void main(String[]args){
        int i,n,a,b,c;
        a=0;
        b=1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n");
            n = sc.nextInt();
            System.out.println("fibonacci:\n0\nl");
        }
        for(i=1;i<=n-2;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }

    }
}

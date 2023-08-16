import java.util.Scanner;// calculate and display sum of n nos
public class program11 {
    public static void main(String[]args){
        int i, n , sum =0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n");
            n = sc.nextInt();
        }
        for(i=1; i<=n ; i++){
            sum+=i;
        }
        System.out.println(sum);



    }
    
}

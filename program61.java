import java.util.Scanner;
public class program61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i =0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        } 
        int sum =0;
        for(int i =0;i<=n-1;i++){
            sum = sum +arr[i];
        }
        System.out.println("sum is :"+ ""+sum);
    }
    
}

import java.util.Scanner;
public class program60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0;i<=n-1;i++){
            arr[i]= sc.nextInt();
        }
        for(int i =0;i<=n-1;i++){
            System.out.print(arr[i] +" ");
        }

    }
    
}

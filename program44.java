import java.util.Scanner;
 public class program44{
    public static void main(String[]args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        n = sc.nextInt();
        int arr[]= new int[n];
        for(i=0;i<=n-1;i++){
            System.out.print(" Enter the no ");
            arr[i]=sc.nextInt();
        }
        for(i=0;i<=n-1;i++){
            System.out.println(arr[i]);
        }
   }
}

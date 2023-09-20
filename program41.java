import java.util.Scanner;// write a program to accept n integer from user using array

public class program41 {
    
    public static void main(String[] args) {
        int i,n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Enter no of elements:");
            n= sc.nextInt();
             int arr[] = new int[n];
            for(i=0;i<arr.length;i++){
                System.out.println("enter a no:");
                arr[i]= sc.nextInt();

            }
            for(i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }

    }
}

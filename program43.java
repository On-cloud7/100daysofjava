import java.util.Scanner;// find a smallest no using array?

public class program43{
    public static void main(String[] args) {
        int i,n,small;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Enter the no of element:");
            n=sc.nextInt();
            int arr[]= new int[n];
            for(i=0;i<arr.length;i++){
                System.out.println(" enter a no");
                arr[i]=sc.nextInt();
            }
            small =arr[0];
            for(i=0;i<arr.length;i++){
                if(small>arr[i])
                small= arr[i];
            }
        }
        System.out.println(" Smallest no :"+ small);
        


    }
}
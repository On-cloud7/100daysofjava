import java.util.Scanner;
public class program42   {// write a program to find the largest no taken from user
    public static void main(String[]args){
        int i,n ,large;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Enter the no of elements:");
            n=sc.nextInt();
            int arr[] =new  int[n];
            for(i=0;i<arr.length;i++){
                System.out.println(" enter the no");
                arr[i]=sc.nextInt();
            }
            for(i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            large =arr[0];
            for(i=0;i<arr.length;i++){
                if(large<arr[i]);
                large=arr[i];
            }
        }
        System.out.println(" Largest no "+ large);



    }
    
}

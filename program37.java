import java.util.Scanner;
public class program37 {
   
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of array:");
            int n=sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<arr.length;i++){
                System.out.println("Enter the data for index : "+i);
                int data =sc.nextInt();
                arr[i] =data;

            }
            System.out.println("Enter the value to search in array:");
            int item =sc.nextInt();
            boolean  flag  = false;
         for(int i=0;i< arr.length;i++){
                if(arr[i]==item){
                    flag =true;
                    break;
                   
                }
            }
          if(flag){
            System.out.println("founded");
          }
          else{
            System.out.println("not founded");
               }
            }
        }
    }    
/*write program to take  input from user as array length ,also  take the value from userand
 * one to search in  array and if it is present print true  else print false.
 */
import java.util.Arrays;
import java.util.Scanner;
 public class program{
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
         System.out.println(" enter the no of student:");
            int student = sc.nextInt();
            System.out.println(" enter the no of sub:");
            int sub = sc.nextInt();
            int [] [] Result = new int [student][sub];
            for(int row= 0;row<student;row++){
               System.out.println("enter the marksof student"+(row+1));
               for(int col =0;col<sub;col++){
                  Result [row][col] = sc.nextInt();
               }
            }
            System.out.println(Arrays.deepToString(Result));
      }
    }
 }
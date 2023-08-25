import java.util.Scanner;
public class program33 {
    public static void main(String[] args) {
     int marks;
     Scanner sc = new Scanner(System.in);
     System.out.println(" Enter value ");
     marks = sc.nextInt();
     if(marks>70){
        System.out.println(" DISTINCTION");
     }        
     else{
        if(marks>60){
            System.out.println(" FIRST CLASS");

        }
        else{
            if(marks>50){
                System.out.println("SECOND CLASS");
            }
            else{
                if (marks>40) {
                    System.out.println(" PASS CLASS");
                    
                }
                else{
                    System.out.println(" FAIL");                    
                        
                    }
                }
             }
        }
     }
 }


    


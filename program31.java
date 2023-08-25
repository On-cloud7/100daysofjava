import java.util.Scanner;
public class program31 { // print  prime no 
    public static void main(String[] args) {
        
    
    int i,n,x=1;
    try (Scanner sc = new Scanner (System.in)) {
        System.out.println(" Enter value of n: ");
         n= sc.nextInt();
    }
    while(n!=0){
        x++;
        i=2;
    
     while (x%i!=0) {
        i++;
        
     }
     if (x==i) {
        System.out.println(x);
        n--;
       }
      }
    }
    
}

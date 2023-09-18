import java.util.Scanner;
class Student{
    private int id,p,c,m,t;
    private String name;
    void accept(){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println(" enter name, id and marks in phy, chem, maths");
            name= sc.nextLine();
            id= sc.nextInt();
            p=sc.nextInt();
            c=sc.nextInt();
            m=sc.nextInt();
        }
        t=p+c+m;

    }
    void display(){
        System.out.println("Name :"+name+"\nID :"+id+"\nPhy :"+p+"\nchem :"+c+"\nmaths :"+m+"\nTotal :"+t);
    }
}
public class program40{
    public static void main(String[] args) {
        Student s = new Student();
        s.accept();
        s.display();
    }
}

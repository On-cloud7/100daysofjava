import java.util.Scanner;

class Circle{
    private float y,  area;
    public void accept(float x){
        y = x;
    }
    public void calculate(){
        area= 3.14f*y*y;
    }
    public void display(){
        System.out.println("Area :"+ area);
    }

}

public class program38{
    public static void main(String[] args) {
        float x;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter radius:");
            x =sc.nextInt();
        }
        Circle c = new Circle();
        c.accept(x);
        c.calculate();
        c.display();
        
    }
}
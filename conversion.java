public class conversion {
    public static void main(String[]args){ //widening to narrowing 
        int i = 9;
        double  mydouble= i;
        System.out.println(i);
        System.out.println(mydouble);
       System.out.println("------------------------------------");  

        double mydoubly = 9.9;
        int num = (int )mydoubly;
        System.out.println(mydoubly);
        System.out.println(num);
    }
    
}

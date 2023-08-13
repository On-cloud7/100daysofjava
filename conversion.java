public class conversion {
    
    public static void main(String[]args){
        //widdening to narrowing
        int num = 9;
        double mydouble= num;
        System.out.println(mydouble); 
        System.out.println(num);

        System.out.println("---------------------------------------------------------");
        // narrowing to widdening 
        double mydoubly =  10.6;
        int num1 = (int)mydoubly;
        System.out.println(mydoubly);
        System.out.println(num1);
         
      System.out.println("--------------------------------------------------------");
      byte b;
      int i = 500;
      float f = 123.942f;
      System.out.println("conversion of float to byte");
      b = (byte)f;
       System.out.println(b);
      System.out.println("conversion of float to in int");
      f=i;
      System.out.println(f);

    }
    
}

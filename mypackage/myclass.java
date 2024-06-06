package mypackage;

public class myclass {
    public static void main(String[] args) {
        employee engineer = new employee("priyanka", 2);
      myclass  Myclass = new myclass();
      employee engineer2 = new employee(null, 0);
      engineer2.setname("priu");
      engineer2.setph(3333);
    System.out.println(engineer2.getph());
    System.out.println(engineer2.getname());
    }
}

class employee{
   private static int empid = 298;
   private int sal = 800000;
   private int incentatives = 200;
   private void countsal(){
        System.out.println(sal+incentatives);
    }

}
class program58{
    public static void main(String[] args) {
        employee engineer = new employee();
        System.out.println(employee.empid);
    }
    
}
package mypackage;

 class employee {
    private int empid = 90;
    private String name ;
    private int ph =0;
    private int basicsal = 9000;
    private int incentive =200;

    employee(String empname, int phoneno){
        ph=phoneno;
        name = empname;
    }
    private void countsalaries(){
        System.out.println(basicsal+incentive);
    }


int getph(){
    return ph;

}
String getname(){
    return name;
}

void setph(int phone){
    ph=phone;

}
void setname(String name){
    this.name =name;
}
}

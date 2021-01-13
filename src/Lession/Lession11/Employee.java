package Lession.Lession11;


import Lession.Lession10.p1.p4.p5.E;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    public double x2(double x){
        x*=2;
        return x;
    }
    public double zp2(){
        salary = salary*2;
        return salary;
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("ivan", 75000.77);
        double z = emp.x2(emp.salary);
        System.out.println(z);
        System.out.println(emp.salary);
        emp.zp2();
        System.out.println(emp.salary);

    }
}
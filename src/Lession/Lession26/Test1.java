package Lession.Lession26;

import Lession.Lession10.p1.p4.D;
import Lession.Lession10.p1.p4.p5.E;

public class Test1 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary + emp1.name + emp1.age + emp1.exp);
        emp1.eat();
        emp1.sleep();




        System.out.println(d.age+d.exp+d.salary+d.name+d.exp);
        d.lechit();
        d.eat();
        d.sleep();

        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();


    }
}
class Employee {
    double salary = 100;
    String name;
    int age;
    int exp;
    private int a=5;

    void eat() {
        System.out.println("kushat");
    }

    void sleep() {
        System.out.println("spat");

    }
}

class Doctor extends Employee {
    String spec;

    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {

    int kolvo_uchenikov;

    void uchit() {
        System.out.println("uchit");
    }
}
class Driver extends Employee{
    String nazvanieMashiny;
    void vodit(){
        System.out.println("vodit");
    }
}

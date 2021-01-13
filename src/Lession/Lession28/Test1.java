package Lession.Lession28;

public class Test1 {
    public static void main(String[] args) {
        Driver [] array1 = {new Driver(), new Driver()};
        Employee [] array2 = {new Driver(), new Teacher(), new Doctor()};
        Help_able [] array3 = {new Teacher(), new Driver(), new Doctor()};
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        emp1.work();
        emp2.work();
        emp3.work();
        Help_able h = new Teacher();
        h.help();
        emp2.help();
    }
}
abstract class Employee implements Help_able{
    void sleep(){
        System.out.println("Employee sleeps");
    }
    abstract void work();
}
class Teacher extends Employee implements Help_able{
    void work(){
        System.out.println("Teacher works");
    }
    public void help(){
        System.out.println("Teacher helps");
    }
}
class Driver extends Employee{
    void work(){
        System.out.println("Driver works");
    }
    public void help(){
        System.out.println("Driver helps");
    }
}
class Doctor extends Employee {
    void work() {
        System.out.println("Doctor works");
    }
    public void help(){
        System.out.println("Doctor helps");
    }
}
interface Help_able{
    void help();
}

package Lession.Lession28;

public class Test2 {

    public static void main(String[] args) {

        Employee2 emp1 = new Teacher2();
        Employee2 emp2 = new Driver2();
        Employee2 emp3 = new Doctor2();
        Employee2 [] array3 = {emp1,emp2,emp3};
        for(Employee2 emp: array3){
            emp.work();
        }
        System.out.println(emp1 instanceof Teacher2);

    }
}
abstract class Employee2 implements Help_able{
    void sleep(){
        System.out.println("Employee sleeps");
    }
    abstract void work();
}
class Teacher2 extends Employee2 implements Help_able2{
    void work(){
        System.out.println("Teacher works");
    }
    public void help(){
        System.out.println("Teacher helps");
    }
}
class Driver2 extends Employee2{
    void work(){
        System.out.println("Driver works");
    }
    public void help(){
        System.out.println("Driver helps");
    }
}
class Doctor2 extends Employee2 {
    void work() {
        System.out.println("Doctor works");
    }
    public void help(){
        System.out.println("Doctor helps");
    }
}
interface Help_able2{
    void help();
}

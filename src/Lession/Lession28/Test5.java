package Lession.Lession28;

public class Test5 {

    public static void main(String[] args) {
        Employee4 emp1 = new Doctor4();
        Employee4 emp2 = new Teacher4();
        Employee4 emp3 = new Driver4();
        Employee4 emp4 = new Employee4();
        Employee4 [] array = {emp1,emp2,emp3,emp4};
        for(Employee4 e:array){
            if(e instanceof Driver4){
                System.out.println(((Driver4) e).nasvanie_avto);
                ((Driver4)e).vodit();
            }

        }

    }

}
class Employee4 {
    double salary = 100;
    String name;
    int age;
    int exp;

    void eat() {
        System.out.println("kushat");
    }

    void sleep() {
        System.out.println("spat");

    }
}

class Doctor4 extends Employee4 implements Help_able4 {
    String spec = "Xirurg";
    public void help(){
        System.out.println("Doctor helpes");
    }
    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher4 extends Employee4 {

    int kolvo_uchenikov;

    void uchit() {
        System.out.println("uchit");
    }
}

class Driver4 extends Employee4 {

    String nasvanie_avto = "BMW";

    void vodit() {
        System.out.println("vodit");
    }
}
interface Help_able4{
    void help();
}


package Lession.Lession28;

public class Test4 {
    public static void main(String[] args) {
        Employee3 emp1 = new Doctor3();
        Employee3 emp2 = new Teacher3();
        Employee3 emp3 = new Driver3();
        Doctor3 d1 = (Doctor3)emp1;
        System.out.println(d1.spec);
        d1.lechit();
        System.out.println(((Driver3)emp3).nasvanie_avto);
        Help_able3 h = new Doctor3();
        h.help();
        System.out.println(((Doctor3)h).spec);
        ((Doctor3)h).lechit();

        Test4 t = new Test4();
        System.out.println(emp1==h);
    }

}
class Employee3 {
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

class Doctor3 extends Employee3 implements Help_able3 {
    String spec = "Xirurg";
    public void help(){
        System.out.println("Doctor helpes");
    }
    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher3 extends Employee3 {

    int kolvo_uchenikov;

    void uchit() {
        System.out.println("uchit");
    }
}

class Driver3 extends Employee3 {

    String nasvanie_avto = "BMW";

    void vodit() {
        System.out.println("vodit");
    }
}
interface Help_able3{
    void help();
}


package Lession.Lession26;

public class Test2 {
    public static void main(String[] args) {
        Teacher2 t = new Teacher2();
        t.eat();
    }
}
class Eda{}
class Frukty extends Eda{}


    class Employee2 {
    double salary = 100;
    String name;
    int age;
    int exp;
    private int a=5;

    Eda eat() {
        System.out.println("kushat");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("spat");

    }
}
    class Teacher2 extends Employee2 {

    int skolvo_uchenikov;

        Frukty eat() {

            System.out.println("kushaet uchitel");
            Frukty f = new Frukty();
            return f;
        }

    void uchit() {
        System.out.println("uchit");
    }
}

class A{
    Employee objectCreation(){
        return new Employee();
    }
}
class B{
    Teacher2 objectCreation(){
        return new Teacher2();
    }
}

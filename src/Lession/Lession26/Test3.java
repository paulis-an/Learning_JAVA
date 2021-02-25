package Lession.Lession26;

public class Test3 {
    public static void main(String[] args) {
        Employee3 e = new Teacher3();
        e.eat();
        Teacher3 t = new Teacher3();
        System.out.println(t.salary) ;
    }
}
class Eda3{}
class Frukty3 extends Eda{}


class Employee3 {
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

     private void sleep() {
        System.out.println("spat");

    }
}
class Teacher3 extends Employee3 {
   double salary = 200;
    int skolvo_uchenikov;
@Override
    Frukty3 eat() {

        System.out.println("kushaet uchitel");
        Frukty3 f = new Frukty3();
        return f;
    }
    void uchit() {
        System.out.println("uchit");
    }
}

class A2{
    Employee objectCreation(){
        return new Employee();
    }
}
class B2{
    Teacher3 objectCreation(){
        return new Teacher3();
    }
}
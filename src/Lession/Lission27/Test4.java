package Lession.Lission27;

import Lession.Lession10.p1.p4.D;

public class Test4 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.x);
        h.pomosh();
        h.tushitPozhar("Voda");
        e.eat();
        s.swim();
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
class Teacher extends Employee implements Help_able{

    int kolvo_uchenikov;

    void uchit() {
        System.out.println("uchit");
    }
    public void pomosh(){
        System.out.println( "uchitel okazyvaet pomoch");
    }
    public void tushitPozhar(String s){
        System.out.println("Uchitel tushit pozhar s pomoshyu "+ s);
    }
}
class Driver extends Employee implements Help_able, Swim_able{
    String nazvanieMashiny;
    void vodit(){
        System.out.println("vodit");
    }
    public void pomosh(){
        System.out.println( "Driver okazyvaet pomoch");
    }
    public void tushitPozhar(String s){
        System.out.println("Driver tushit pozhar s pomoshyu "+s);
    }
    public void swim(){
        System.out.println("Driver plavaet");
    }

}

interface Help_able{
    void pomosh();
    void tushitPozhar(String predmet);
    public final static int x=5;
}
interface Swim_able{
    void swim();
}
abstract class Y implements Swim_able{
}
abstract class X extends Y{}
class Z extends X{
    public void swim(){
        System.out.println("Plavat");
    }
}
package Lession.Lesson25;

import Lession.Lession10.p1.p4.p5.E;

public class Test3 {
    void uvelZP(Employee e){
    e.salary = e.salary+10;
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 39;
        doc.eat();
        doc.lechit();

    }
}
    class Employee {
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

    class Driver extends Employee {

        String nasvanie_avto;

        void vodit() {
            System.out.println("vodit");
        }
    }


package Lession5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void  info() {
        System.out.println("Imya: " + name + "  Cvet: " + car.color + " Motor:  " + car.engine + "  Balance: " + bA.balance);
    }
}
class HumanTest {


    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Paulis";
        h.car = new Car3("RED", "V6");
        h.bA = new BankAccount(1, 25200);
        h.info();

    }
}
class Car3 {
    String color;
    String engine;

    Car3(String c, String e) {
        color = c;
        engine = e;
    }
}
 class BankAccount {
     int id;
     double balance;
     BankAccount(int id2, double balance2) {
         id = id2;
         balance = balance2;
        }
    }

package Lession.Lession5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void  info() {
        System.out.println("Imya: " + name + "  Cvet: " + car.color + " Motor:  " + car.engine + "  Balance: " + bA.balance);
    }
    void popolnenie(double summaPopolneniya){
        System.out.println();
        System.out.println("Summa do popolneniya - " + bA.balance);
        System.out.println("Summa popolneniya - " + summaPopolneniya);
        bA.balance += summaPopolneniya;
        System.out.println("Summa posle popolneniya - " + bA.balance);
        System.out.println();
    }
    void snyatie(double summaSnyatiya){
        System.out.println();
        System.out.println("Summa do snyatiya - " + bA.balance);
        System.out.println("Summa snyatiya - " + summaSnyatiya);
        bA.balance -= summaSnyatiya;
        System.out.println("Summa posle snyatiya - " + bA.balance);
        System.out.println();
    }
}
class HumanTest {


    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Paulis";
        h.car = new Car3("RED", "V6");
        h.bA = new BankAccount(1, 25200);
        h.info();
        h.popolnenie(125.5);
        h.snyatie(8233.3);

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

package Lession8;

import javax.print.DocFlavor;

public class Car {
    String color = "Blue";
    String engine = "V8";

}
class Human {
    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
//        h1.c = new Car();
        h1.c.engine = "V6";
        h1.c.color = "RED";
        System.out.println(h1.c.color = "RED");
    }
}

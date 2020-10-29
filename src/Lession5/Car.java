package Lession5;

import Lession6.Employee;

public class Car {
    String carName;
    String color;
    String engine;
    int speed;
    Car (String name, String cvet, String motor, int Maxspeed){
        carName = name;
       color = cvet;
       engine = motor;
       speed = Maxspeed;
    }
}
class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("FERRARI","Black", "V8", 280);
        System.out.println( car1.carName  + " = " + car1.color + " - " + car1.engine + " - " + car1.speed);
    }
}
class Test {
    public static void main(String[] args) {
        Lession6.Employee employ = new Lession6.Employee(1,"Zaharov");
        System.out.println(employ.surname);
    }
}
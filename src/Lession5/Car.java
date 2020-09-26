package Lession5;

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
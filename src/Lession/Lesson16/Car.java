package Lession.Lesson16;

public class Car {
    String color;
    String  engine;

    Car(String color, String engine){
        this.color=color;
        this.engine=engine;

    }
    final static int a = 5;

    public Car abc(String cvet){
        Car c10 = new Car(cvet, "V6");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V8");
        Car c2 = c.abc("black");
        System.out.println(c.color + c.engine + c2.color);
    }

}

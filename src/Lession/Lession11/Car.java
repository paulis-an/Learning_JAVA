package Lession.Lession11;

public class Car {
    String color;
    String engine;
    int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}
class carTest {
    void cangeDoors(Car c, int s) {
        c.doors = s;

    }

    public void swap(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;

    }

    public static void main(String[] args) {
        carTest d = new carTest();
        Car car1 = new Car("Black", "V6", 3);
        Car car2 = new Car("Blue", "V8", 5);
        d.cangeDoors(car1, 7);
        d.cangeDoors(car2, 4);
        d.swap(car1, car2);

        System.out.println(car1.color + " " + car1.engine + " " + car1.doors);
        System.out.println(car2.color + " " + car2.engine + " " + car2.doors);

    }
}



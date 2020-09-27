package Lession5;

public class Car5 {
    String car;
    String color;
    int speed;

    int gaz() {
        speed += 40;
        return speed;
    }

    int tormoz(int s) {
        speed -= s;
        return speed;

    }

    void show() {

        System.out.println("auto: " + car + "; cvet: " + color + "; skorost: " + speed);
    }
}
class car2 {

    public static void main(String[] args) {
        Car5 a1 = new Car5();
        a1.car = "Ferrari";
        a1.color = "Blue";
        a1.speed = 180;

        a1.show();
        a1.gaz();
        a1.show();
        a1.tormoz(110);
        a1.show();

    }

}
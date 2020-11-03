package Lession.Lession9;

public class Car {
    String color;
    String engine;
    static int count;
    static int cena = 50000;
    Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
        System.out.println(count);
    }
    public void showColor(){

        System.out.println("Cvet mashiny - " + color);
        System.out.println("Cena - " + cena);
        cena += 1000;
        changeColor("Red");

    }
    public void changeColor(String color3){
        color = color3;
        count++;
        System.out.println(count);
//        cena += 1000;
        System.out.println("Cvet mashiny izmenilsya - " + color);
//        int cena = 50000;

        System.out.println("Cena izmenilas - " + cena);



    }

    public static void main(String[] args) {
        Car c = new Car("Blue", "v10");
        c.showColor();
        c.changeColor("Orange");
    }
}

package Lession12;

public class Car {
    int engine;
    int doors;
    String color;
    Car (int engine, int doors, String color){
        this.engine = engine;
        this.doors = doors;
        this.color = color;

    }
}
class CarTest{
    public static void main(String[] args) {
        Car c1 = new Car(3,3, "black");
        Car c2 = new Car(2,4, "blue");

        if (c1.engine> c2.engine ){
            if(c1.doors> c2.doors){
                System.out.println("Moshnost motora i dverey bolshe u 1");
            } else{
                System.out.println("Moshnost motora bolshe u 1, a dverey bolshe u 2");
            }
        }
        else{
                System.out.println("Moshnost motora u 1 menshe");
            }
        if(c1.color.equals(c2.color)){
            System.out.println("Mashiny odnogo cveta");
        }
        else {
            System.out.println("Mashiny raznogo cveta");
        }

    }

}
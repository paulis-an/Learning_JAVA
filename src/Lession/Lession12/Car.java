package Lession.Lession12;

import Lession.Lession10.p1.p2.p3.C;

public class Car {
    int engine;
    int doors;
    Car (int engine, int doors){
        this.doors = doors;
        this.engine = engine;
            }
}
class carTest{
    public static void main(String[] args) {
        Car c1 = new Car(4, 6);
        Car c2 = new Car(3, 4);
        if(c1.engine>c2.engine)
            if(c1.doors>c2.doors)
            System.out.println("Moshnost i kolichesvo dverey u 1 car bolshe");
            else
            System.out.println("Moshnost i kolichesvo dverey u 2 car bolshe");
        else;

    }

}

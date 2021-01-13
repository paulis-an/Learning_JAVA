package Lession.Lission27;

public class Test7 {
}
interface I2 {
      default void abc() {
        System.out.println("eto metod abc");
    }
    static void def() {
        System.out.println("eto static metod def");
    }
}
interface I3 extends I2{
    void abc();
}
abstract class R implements I1{
    public void abc() {
        System.out.println("eto metod abc classa R");
    }

    public static void main(String[] args) {
        I2.def();
    }
}

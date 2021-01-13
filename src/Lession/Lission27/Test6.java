package Lession.Lission27;

public class Test6 {
}
interface I1{
    void abc();
    default void def() {
        System.out.println("eto metod def");
    }
}
class Z2 implements I1{

    @Override
    public void abc() {
        System.out.println("eto metod abc");
    }
    public void def(){
        System.out.println("eto overide def");
    }

    public static void main(String[] args) {
        Z2 z=new Z2();
        z.abc();
        z.def();
    }
}

package Lession.Lession28;

public class Test7 {
}

class Test10{
    int a=10;
    void abc(){
        System.out.println("ok1");
    }
}
class Test20 extends Test10 {
    int a=20;
    void abc(){
        System.out.println("ok2");
    }
}
class Test30 extends Test20{
    int a=30;
    void abc(){
        //super.abc();
        System.out.println("ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10)t).a);
        ((Test10)t).abc();
    }
}
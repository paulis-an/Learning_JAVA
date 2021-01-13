package Lession.Lesson24;

public class Test2 {

    Test2(){
        System.out.println("object");
    }

    void Test2(){
        System.out.println("Eto method");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();

        t.Test2();

    }
}

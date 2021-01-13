package Lession.Lission27;

public class Test8_newJava9 {
}
interface I10{
    static void method() {

    }

    default void method1(){
    System.out.println("Eto method 1");
}
default void method2(){
        method1();
        method();
}
static void method4(){
        method();

}
}


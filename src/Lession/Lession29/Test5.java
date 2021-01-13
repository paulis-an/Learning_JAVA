package Lession.Lession29;

public class Test5 {
    {
        System.out.println("Eto init block3");
    }
    Test5(){
    System.out.println("Eto konstruktor 1");
    }
    Test5(int a){
    this();
        System.out.println("Eto konstruktor 2");
    }
    {
        System.out.println("Eto init block1");
    }
    static {
        System.out.println("Eto ststic init block");
    }

    public static void main(String[] args) {
        Test5 test1 = new Test5();
        Test5 test2 = new Test5(3);
    }
}

package Lession8;



public class Test1 {
    public final int a;
    Test1() {
    a = 10;
    }
    Test1(int b){
    a = 33;
    }
    public void abc(double s){
    final byte b = 10;
        System.out.println(s + b);
    }
    public static void main(String[] args) {
        Test1 test = new Test1(25);
//        test.a = test.a *2;
        System.out.println(test.a);
        Test1 test1 = new Test1();
        System.out.println(test1.a);
        test1.abc(36.2);


    }
}

package Lession.Lession28;

public class Test12 {

}
class Test21 implements I1,I2{
    public void abc(){
        System.out.println("ok");
    }

    public static void main(String[] args) {
        Test21 t = new Test21();
        System.out.println(((I2)t).a);
        t.abc();
    }

}
interface I1{
    int a=10;

    void abc();
}
interface I2{
    int a = 20;
    void abc();
}
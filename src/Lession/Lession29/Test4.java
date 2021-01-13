package Lession.Lession29;

public class Test4 {
    String s;
    {
        System.out.println("Hello");
        int  a = 5;
        System.out.println(a);
        s = "ok";
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        Test4 t1 = new Test4();
    }
}

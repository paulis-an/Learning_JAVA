package Lession.Lession29;

public class Test7 {
}
class C2{
    String s = "ok";
    {
        System.out.println(s);
    }
    static int i = 0;
    static {
        System.out.println(i);
    }
    {i=i+1;
        System.out.println(i);}
    C2(){
        System.out.println("konstructor");
    }

    public static void main(String[] args) {
        System.out.println("Privet!");
        C2 c = new C2();
    }
}

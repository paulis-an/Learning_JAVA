package Lession.Lession9;

public class DZ {
    int a=1;
    static int b = 2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(DZ.b);
    }

    public static void main(String[] args) {
        DZ t = new DZ();
        t.abc(4);
    }
}

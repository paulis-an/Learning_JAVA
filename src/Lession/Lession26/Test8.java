package Lession.Lession26;

public class Test8 {
    String s1 = "Privet";
    static double d = 3.14;
    int summa (int...i){
        int result =0;
        for(int a:i){
            result += a;
        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }
}
class Test9 extends Test8{
    String s1 = super.s1 + ", drug";
    int summa (int ... i){
        int result = super.summa(i);
        System.out.println("Summa: " + result);
        super.abc();
        return result;
    }

    public static void main(String[] args) {
        Test9 t = new Test9();
        System.out.println(t.s1);
        t.summa(12);
    }
}

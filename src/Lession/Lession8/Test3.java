package Lession.Lession8;

public class Test3 {
    static final double pi=3.14;
    double radius;

    double ploshad(double radius) {
        double pl = pi * radius * radius;

        System.out.println("Радиус = " + radius + "   Ploshad kruga = " + pl);
        return pl;
    }
    public static double dlina(double radius2) {
        double dl = 2 * pi * radius2;
        System.out.println("Радиус = " + radius2 + "   Dlina kruga = " + dl);
        return dl;
    }
    public void all(double radius3) {


        ploshad(radius3);

        dlina(radius3);

    }

    }
    class Test4{
        public static void main(String[] args) {

            Test3.dlina(20.3);
            Test3 test = new Test3();
            test.ploshad(12.2);
            test.all(2.5);

        }

}

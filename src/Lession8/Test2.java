package Lession8;

import javax.imageio.stream.ImageInputStream;

public class Test2 {
//    public int a;
//    public int b;
//    public int c;
    static int multi() {
        int a = 10;
        int b = 20;
        int c = 30;
        return (a * b * c);
    }
    static void def() {
        int a = 40;
        int b = 18;
        int celoe = a / b;
        int ostatok = a % b;
        System.out.println("Celoe = " + celoe + "  Ostatok = " + ostatok);
    }
    public static void def2(int a, int b) {
        int celoe = a / b;
        int ostatok = a % b;
        System.out.println("Celoe = " + celoe + "  Ostatok = " + ostatok);
    }

    public static void main(String[] args) {
        System.out.println(multi());
        def();
        def2(572, 28);
    }



}


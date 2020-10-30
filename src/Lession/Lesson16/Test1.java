package Lession.Lesson16;

public class Test1 {
    public static void main(String[] args) {


        String s1 = new String("ahlkhlvcnlallANLCANLAAa");
        int a = s1.length();
        char c1 = s1.charAt(3);
        System.out.println(a);
        System.out.println(c1);

        int i1=s1.indexOf("t");
        System.out.println(i1);

        int i2=s1.indexOf("vet");
        System.out.println(i2);

        int i3 = s1.indexOf('a', 20);
        System.out.println(i3);

        boolean b1 = s1.startsWith("ah");
        System.out.println(b1);

        boolean b2 = s1.endsWith("Aa");
        System.out.println(b2);
    }
}

package Lession.Lesson16;

public class Test2 {
    public static void main(String[] args) {


        String s1 = new String("Privet");

        String s10 = s1.substring(2);
        System.out.println(s10);

        String s11 = s1.substring(1, 4);
        System.out.println(s11);

        String s12 = s1.trim();
        System.out.println(s12);

        String s13 = s1.replace("t", "T");
        System.out.println(s13);

        String s15 = ", drug!";
        System.out.println(s1.concat(s15));

    }

}

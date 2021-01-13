package Lession.Lesson20;

public class Test2 {
    static void summa(String s, int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        System.out.println(s);
    }

    public static void main(String[] args) {
        summa("Privet", 2, 5, 19, 5, 7);

    }
}

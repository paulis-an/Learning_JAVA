package Lession.Lesson15;

public class Test3 {


    public static void main(String[] args) {
        boolean b = true;
        int a = 1;
        while (b) {
            System.out.println(a);
            if (a%3==0 && a%2==0) {
                b=false;
            }
            a++;
        }
    }
}



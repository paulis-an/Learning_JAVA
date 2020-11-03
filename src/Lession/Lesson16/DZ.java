package Lession.Lesson16;

public class DZ {

    public void Email(String s) {
        int a = 0; // posiciya simvola @
        int b = 0; // posiciya simvola .
        int c = 0; // posiciya simvola ;

        for(int i=0; c < (s.length()-1); i++){
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c +1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public void Email2(String s1) {
        int a = 0; // posiciya simvola @
        int b = 0; // posiciya simvola .
        int c = 0; // posiciya simvola ;

        while (c<s1.length() - 1){
            a = s1.indexOf('@', c);
            b = s1.indexOf('.', c);
            c = s1.indexOf(';', c +1);
            System.out.println(s1.substring(a + 1, b));
        }
    }


    public static void main(String[] args) {
        DZ str = new DZ();
        str.Email("ya@yahoo.com; on@mail.ru; ona@gmail.com; www@ya.ru;");
        System.out.println();

        str.Email2("ya@bk.ru; on@gmail.com:;");
    }
}








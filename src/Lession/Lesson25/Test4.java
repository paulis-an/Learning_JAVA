package Lession.Lesson25;

public class Test4 {
}


class Human2{
    Human2(String n){
        this(n,null);
    }

    Human2(String n, String s){
        name = n;
        surname = s;
    }
    String name = "Hren";
    String surname;
}

class Student2 extends Human2{
    Student2(){
        super("Petya");
    }
    public static void main(String[] args) {
        Student2 s = new Student2();

    }
}



package Lession.Lession8;


public class Student {
    String name;
    int course;
    static int id;
    int a;

    public Student(String name2, int course2){
        id++;
        name= name2;
        course = course2;
        System.out.println("Student # - " + id);
    }
    public static void show(){
        System.out.println("Vsego sozdano "+ id + " zapisi.");
    }
    public void showHi(){
        System.out.println("Welcome!!!");
    }
    void abc(){
        a++;
        id++;
    }
    static  void abcd(){
//        id++;
        Student st2 = new Student("Karp", 2);
        st2.a++;
    }
    public static void main(String[] args) {

        Student st1 = new Student("Petrov", 1);
        st1.showHi();
        Student st2 = new Student("Ivanov", 1);
//        show();
        Student st3 = new Student("Zaharov", 3);
        show();
        abcd();
        show();
        st1.abc();

    }
}


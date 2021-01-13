package Lession.Lesson25;

import Lession.Lession4_1.Stud;

public class Human {
//    public Human(String n){
//        name = n;
//    }

    private String name = "Hren";
    public String getName(){return name; };
    public void setName(String n ){ name = n; };
    public static int salary = 150;
    public void work(){
        System.out.println("rabotat");
    }
    public static void rest(){
        System.out.println("otdyhat");
    }
}
class Student extends Human{
    public static void main(String[] args) {
        Student s= new Student();
        System.out.println(Student.salary);
        s.work();
        Student.rest();
        s.setName("Petr");
        System.out.println(s.getName());

    }
}



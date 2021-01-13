package Lession.Lession11;

import Lession.Lession4_1.Stud;

public class Student {
    String name;
    int course;
    double grade;
    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;

    }
    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1=s2;
        s2=s3;
    }
    public static void changeName(Student s1){
        s1.name = "vasya";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 2,4.6);
        Student st2 = new Student("Petr", 3,5.6);
        swap(st1,st2);
        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st2);
        System.out.println(st2.name);
    }
}

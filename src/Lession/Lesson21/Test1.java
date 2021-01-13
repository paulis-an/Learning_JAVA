package Lession.Lesson21;


import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {


        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);


        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("poka");

        ArrayList<StringBuilder> sb1 = new ArrayList<>(30);
        ArrayList<String> list5 = new ArrayList<>(list2);

    }

   public static class Car {

    }

    public static class Student{}
}

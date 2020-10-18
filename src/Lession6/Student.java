package Lession6;


import java.sql.SQLOutput;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Student {
    int id;
    String name;
    String surname;
    String fakultet;
    double srOcenka;

    Student(int id1, String name1, String surname1, String fakultet1, double srOcenka1) {
        id = id1;
        name = name1;
        surname = surname1;
        fakultet = fakultet1;
        srOcenka = srOcenka1;
    }

    Student(String surname2, String fakultet2, double srOcenka2) {
        this(0, null, surname2, fakultet2, srOcenka2);
            }

    Student() {
        this(0, null, null, null, 0.0);
    }

    void print() {
        System.out.println(id);
        id += 1;
    }

}
class StudentTest{
    public static void main(String[] args) {
        Student st = new Student(1, "Ivan", "Petrov", "IT", 4.5);
        st.print();
        System.out.println(st.name +" " + st.surname + " " + st.fakultet + " " + st.srOcenka);
//        System.out.println(st.surname + " " + st.fakultet + " " + st.srOcenka);
        Student st2 = new Student( "Ivanov", "IZO", 3.8);
        st.print();
        System.out.println(st2.surname + " " + st2.fakultet + " " + st2.srOcenka);

        Student st3 = new Student(2, "Ilya", "Skvorzov", "HZ", 4.2);
        st.print();
        System.out.println(st3.name +" " + st3.surname + " " + st3.fakultet + " " + st3.srOcenka);
    }
}





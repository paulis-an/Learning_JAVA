package Lession12;
import Lession11.Student;

public class DZ{


}
class StudentTest {
    public static void a(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Studenty ravny");
        } else {
            System.out.println("Studenty ne ravny");
        }

    }

    public static void b(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Vse parametry odinakovye");
                } else {
                    System.out.println("Imena i  kursy odinakovye, ocenki raznye");
                }
            } else {
                System.out.println("imena odinakovye, kursy raznye");
            }
        } else {
            System.out.println("Imena raznye");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 2, 4.4);
        Student s2 = new Student("Ivan", 2, 4.7);
        a(s1, s2);
        b(s1, s2);
    }
}

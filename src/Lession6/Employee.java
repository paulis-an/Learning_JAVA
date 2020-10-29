package Lession6;

public class Employee {
    Employee(int id1, String surname1, int age1) {
        this(id1, surname1, age1, 0.0, null);
//        id = id1;
//        age = age1;
//        surname =  surname1;

    }

    public Employee(int id2, String surname2) {
        this(id2, surname2, 0, 0.0, null);

    }

    Employee(int id3, String surname3, int age3, double salary3, String department3) {
        id = id3;
        surname = surname3;
        age = age3;
        salary = salary3;
        department = department3;
    }

    int id;
    public String surname;
    int age;
    double salary;
    String department;
}
class EmploeeTest {
       public static void main(String[] args) {

        Employee emp = new Employee(1, "Ivanov", 38);
        System.out.println(emp.id + " " + emp.surname +" "+ emp.age);
        Employee emp2 = new Employee(2, "Petrov");
        System.out.println(emp2.id + " " + emp2.surname);
        Employee emp3 = new Employee(3, "Pedro",55, 78000, "WEB");
        System.out.println(emp3.id + " " + emp3.surname +" " + emp3.salary + " " + emp3.department);
    }
}

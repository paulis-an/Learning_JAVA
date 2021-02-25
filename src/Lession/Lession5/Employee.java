package Lession.Lession5;


public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id2, String surname2, int age2, double salary2, String department2) {
        this.id = id2;
        this.surname = surname2;
        this.age = age2;
        this.salary = salary2;
        this.department = department2;
    }

    public void printOut() {
        System.out.println("ID - " + this.id + "| Famaliya - " + this.surname + "| Vozrast - " + this.age + "| ZP = " + this.salary + "| DP - " + this.department);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(2, "An", 35, 45000.0D, "IT");
        emp.printOut();
        System.out.println("New ZP = " + emp.EmploeeTest());
        Employee emp2 = new Employee(3, "Ani", 25, 38000.0D, "IT");
        emp2.printOut();
        System.out.println("New ZP = " + emp2.EmploeeTest());
    }

    double EmploeeTest() {
        double upsalary = this.salary * 2.0;
        return upsalary;
    }
}


package Lession.Lession6;

class Employee {
    Employee(int id2, String surname2, int age2){
        this(id2, surname2);
        age = age2;

    }
    Employee(int id2, String surname2){
        id = id2;
        surname = surname2;
    }
    Employee(int id3, String surname3, int age3, double salary3, String department3){
        this(id3, surname3, age3);
        salary = salary3;
        department = department3;
    }
    Employee (double salary4){

        salary = salary4;
    }
    public void getSalary(){
        System.out.println("ZP = " + salary);
    }
       int id;
       String surname;
       int age;
       private double salary;
       String department;
}
 class EmploeeTest {
     public static void main(String[] args) {
         Employee emp = new Employee(1, "Ivanov", 38);
         System.out.println(emp.id + " " + emp.surname +" "+ emp.age);
         Employee emp2 = new Employee(2, "Petrov");
         System.out.println(emp2.id + " " + emp2.surname);
         Employee emp3 = new Employee(3, "Pedro",55, 78000, "WEB");
//         System.out.println(emp3.id + " " + emp3.surname +" " + emp3.salary + " " + emp3.department);
         Employee emp4 = new Employee(42000);
         emp.getSalary();
     }
 }
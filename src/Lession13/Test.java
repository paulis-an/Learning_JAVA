package Lession13;

public class Test {
}
class Student{
    int grade;
    Student(int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(1);
        switch (st1.grade){
            case 2:
                System.out.println("student dvoechnik");
                break;
            case 3:
                System.out.println("student troechnik");
                break;
            case 4:
                System.out.println("student horoshist");
                break;
            case 5:
                System.out.println("student otlichnik");
                break;
            default:
                System.out.println("ne pravilnye parametry");
        }
        }

}




package Lession.Lesson20;

public class Test5 {

    public static void main(String[] args) {
        String [] Students = {"Ivanov","Petrov","Sidorov"};
        String [] exams = {"mat analis","filosofiya"};
        for(String s1: Students){
            for(String s2: exams) {
                System.out.println(s1 + " - " + s2);
            }
        }

    }
}

package Lession4;

public class StudentNew {
    int NumStBil;
    String name;
    String subname;
    int Year;
    double raitingMath;
    double raitingEco;
    double raitingLang;

class StudentTesting {
    double averageMath;
    double averageEco;
    double averageLang;

}
 public static void main(String[] args) {
     StudentNew name1 = new StudentNew();
     name1.name = "Ivan";

     StudentNew math1 = new StudentNew();
     math1.raitingMath = 4.3;

     StudentNew eco1 = new StudentNew();
     eco1.raitingEco = 2.9;

     StudentNew lang1 = new StudentNew();
     lang1.raitingLang = 4.9;

     StudentNew name2 = new StudentNew();
     name2.name = "Vitya";

     StudentNew math2 = new StudentNew();
     math2.raitingMath = 3.3;

     StudentNew eco2 = new StudentNew();
     eco2.raitingEco = 2.9;

     StudentNew lang2 = new StudentNew();
     lang2.raitingLang = 3.9;

     StudentNew name3 = new StudentNew();
     name3.name = "Loh";

     StudentNew math3 = new StudentNew();
     math3.raitingMath = 2.3;

     StudentNew eco3 = new StudentNew();
     eco3.raitingEco = 2.9;

     StudentNew lang3 = new StudentNew();
     lang3.raitingLang = 2.9;

     double ave1 = (math1.raitingMath + eco1.raitingEco + lang1.raitingLang) / 3;
     double ave2 = (math2.raitingMath + eco2.raitingEco + lang2.raitingLang) / 3;
     double ave3 = (math3.raitingMath + eco3.raitingEco + lang3.raitingLang) / 3;

//     StudentTest ave1 = new StudentTest();
//     ave1.averageMath = (math1.raitingMath + eco1.raitingEco + lang1.raitingLang) / 3;
//
//     StudentTest ave2 = new StudentTest();
//     ave2.averageMath = (math2.raitingMath + eco2.raitingEco + lang2.raitingLang) / 3;
//
//     StudentTest ave3 = new StudentTest();
//     ave3.averageMath = (math3.raitingMath + eco3.raitingEco + lang3.raitingLang) / 3;


     System.out.println("Средняя оценка " + name1.name + " - " + ave1);
     System.out.println("Средняя оценка " + name2.name + " - " + ave2);
     System.out.println("Средняя оценка " + name3.name + " - " + ave3);


    }
}

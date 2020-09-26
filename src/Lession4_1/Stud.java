package Lession4_1;

public class Stud {
    int NumStBil;
    String name;
    String subname;
    int Year;
    double raitingMath;
    double raitingEco;
    double raitingLang;
    //    double allRaiting = (raitingMath + raitingEco + raitingLang) / 3;
//    class StudentTest {
        public static void main(String[] args) {
            Stud students1 = new Stud();
            students1.name = "Pavel";
            students1.subname = "An";
            students1.Year = 2000;
            students1.raitingMath = 4.4;
            students1.raitingEco = 4.8;
            students1.raitingLang = 4.6;

            Stud students2 = new Stud();
            students2.name = "Serzh";
            students2.subname = "Klop";
            students2.Year = 2009;
            students2.raitingMath = 3.4;
            students2.raitingEco = 3.2;
            students2.raitingLang = 3.6;

            Stud students3 = new Stud();
            students3.name = "Kon";
            students3.subname = "Pedalny";
            students3.Year = 2011;
            students3.raitingMath = 2.4;
            students3.raitingEco = 2.2;
            students3.raitingLang = 2.7;

            double ave1 = (students1.raitingMath + students1.raitingEco + students1.raitingLang) / 3;
            double ave2 = (students2.raitingMath + students2.raitingEco + students2.raitingLang) / 3;
            double ave3 = (students3.raitingMath + students3.raitingEco + students3.raitingLang) / 3;



            System.out.println("Средняя оценка " + students1.name + " " + students1.subname + " - " + ave1);
            System.out.println("Средняя оценка " + students2.name + " " + students2.subname + " - " + ave2);
            System.out.println("Средняя оценка " + students3.name + " " + students3.subname + " - " + ave3);



        }


//    }
}
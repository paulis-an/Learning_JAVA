package Lession.Lession4;

public class St {
    int NumStBil;
    String name;
    String subname;
    int Year;
    double raitingMath;
    double raitingEco;
    double raitingLang;
//    double allRaiting = (raitingMath + raitingEco + raitingLang) / 3;
//class StudentTest {
    public static void main(String[] args) {
        St stud1 = new St();
        stud1.name = "Pavel";
        stud1.subname = "An";
        stud1.Year = 2000;
        stud1.raitingMath = 4.4;
        stud1.raitingEco = 4.2;
        stud1.raitingLang = 4.6;

        St stud2 = new St();
        stud2.name = "Serzh";
        stud2.subname = "Klop";
        stud2.Year = 2009;
        stud2.raitingMath = 3.4;
        stud2.raitingEco = 3.2;
        stud2.raitingLang = 3.6;

        St stud3 = new St();
        stud3.name = "Kon";
        stud3.subname = "Pedalny";
        stud3.Year = 2011;
        stud3.raitingMath = 2.4;
        stud3.raitingEco = 2.2;
        stud3.raitingLang = 2.6;

        double ave1 = (stud1.raitingMath + stud1.raitingEco + stud1.raitingLang) / 3;
        double ave2 = (stud2.raitingMath + stud2.raitingEco + stud2.raitingLang) / 3;
        double ave3 = (stud3.raitingMath + stud3.raitingEco + stud3.raitingLang) / 3;



        System.out.println("Средняя оценка " + stud1.name + stud1.subname + " - " + ave1);
        System.out.println("Средняя оценка " + stud2.name + stud2.subname + " - " + ave2);
        System.out.println("Средняя оценка " + stud3.name + stud3.subname + " - " + ave3);



    }


//}
}



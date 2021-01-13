package Lession.Lession4;

public class Student {
    int numberStudBilet;
    String name;
    String surname;
    int year;
    double averageRatingMath;
    double averageRatingEconomy;
    double averageRatingLanguage;

    public static void main(String[] args) {
        Student name1 = new Student();

        name1.name = "Ivan";

        Student math1 = new Student();
        math1.averageRatingMath = 4.3;

        Student eco1 = new Student();
        eco1.averageRatingEconomy = 2.9;

        Student lang1 = new Student();
        lang1.averageRatingLanguage = 4.9;

        double allRaiting1 = (math1.averageRatingMath + eco1.averageRatingEconomy + lang1.averageRatingLanguage) / 3;

        System.out.println("Средняя оценка " + name1.name + " - " + allRaiting1);




        }




    }





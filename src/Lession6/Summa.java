package Lession6;

public class Summa {
    int id1;
    int id2;
    int id3;
    int id4;
    int id5;

    Summa(int num11, int num12, int num13, int num14, int num15) {
        id1 = num11;
        id2 = num12;
        id3 = num13;
        id4 = num14;
        id5 = num15;
    }

    Summa(int num21, int num22, int num23, int num24) {
        this(num21, num22, num23, num24, 0);
    }

    Summa(int num31, int num32, int num33) {
        this(num31, num32, num33, 0, 0);
    }

    Summa(int num41, int num42) {
        this(num41, num42, 0, 0, 0);
        System.out.println("Summa dvuh chisel ");
    }

    Summa(int num51) {
        this(num51, 0, 0, 0, 0);
    }

    Summa() {
        this(0, 0, 0, 0, 0);
    }

    int Sum() {
        int sum1 = id1 + id2 + id3 + id4 + id5;
        return sum1;

    }

    public static void main(String[] args) {
        Summa sum = new Summa(1, 2, 3, 4, 5);
        System.out.println("Сумма чисел 5-ти чисел равна = " + sum.Sum());
        Summa sum2 = new Summa(1, 2, 3, 8);
        System.out.println("Сумма чисел 4-х чисел равна = " + sum2.Sum());
        Summa sum3 = new Summa(1, 2, 16);
        System.out.println("Сумма чисел 3-х чисел равна = " + sum3.Sum());
        Summa sum4 = new Summa(1, 25);
        System.out.println("Сумма чисел 2-х чисел равна = " + sum4.Sum());
        Summa sum5 = new Summa(63);
        System.out.println("Здесь только одно слагаемое и оно равно = " + sum5.Sum());
        Summa sum6 = new Summa();
        System.out.println("Сумма равна = " + sum6.Sum());

    }
}
class Test {
       public static void main(String[] args) {
           Employee employ = new Employee(1,"Kozlov");
           System.out.println(employ.surname);
       }
   }



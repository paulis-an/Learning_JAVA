package Lession.Lession5;

public class Test {

    int summa(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }
}

class Test25 {
    public static void main (String[] args) {
        Test t = new Test();
        int summaChisel = t.summa(5, 10, 50);
        System.out.println(summaChisel);

    }
}



package Lession13;

public class DZ {
}
class Month{
    public static void days(int n) {
        switch (n) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("V mesyace 31 den");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("V mesyace 30 dney");
                break;
            case 2:
                System.out.println("V mesyace 28 dney");
                break;
            default:
                System.out.println("Ne pravilno");

        }
    }
    public static void main(String[] args) {
        days(9);



    }

}

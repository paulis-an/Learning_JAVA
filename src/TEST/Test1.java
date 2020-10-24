package TEST;
import java.util.Scanner;
public class Test1 {
    static int nach = 6;
    static int piz = nach;
    static int chees = 10;
    static int wat = 4;
    static int coke = 5;
    static int sum = 0;

    public static void sum(String s){
        switch (s) {
            case ("nach"):
                sum += nach;
                break;
            case ("piz"):
                sum += piz;
                break;
            case ("chees"):
                sum += chees;
                break;
            case ("wat"):
                sum += wat;
                break;
            case ("coke"):
                sum += coke;
                break;
            default:
                sum+=coke;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 4 позиции из меню");
        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();
        String s4 = scan.next();
        sum(s1);
        sum(s2);
        sum(s3);
        sum(s4);

        System.out.println(sum*1.07);
    }
}

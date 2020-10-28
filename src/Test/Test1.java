package Test;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int yard = scan.nextInt();
        if (yard > 10 && yard <120) {
            System.out.println("High five");
        } else if (yard < 1) {
            System.out.println("shh");
        } else if (yard>=1 && yard<=10 ) {
            while (yard > 0) {
                System.out.println("Ra!");
                --yard;
            }
        }
        else {
            System.out.println("error");
        }
    }
}



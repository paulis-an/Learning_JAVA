package Test;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int z = (int)Math.round(200d/num);
        System.out.println(z);

    }
}
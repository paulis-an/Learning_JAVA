package Test;
import java.util.Scanner;

public class Secret_message {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.toLowerCase();
        String z = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        z = z.replaceAll("[^a-z]", "");
//        System.out.println(z);
        char[] c = z.toCharArray();
        char[] c2 = s.toCharArray();
        char y;
        for (char cc : c2) {
            if(cc == ' ')
                System.out.print(" ");
            for (int i = 0; i < c.length; i++) {
                if (c[i] == cc) {
                    y = c[(c.length -1 - i)];
                    System.out.print(y);

                }

            }

        }
    }
}

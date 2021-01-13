package Test;
import java.util.Scanner;

public class The_spy_life {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        String st1 = s.replaceAll("[^A-Za-z ]", "");
        char [] c= st1.toCharArray();
        System.out.println(c);
        char x;
        int y = c.length;
        int z= y-1;
        for(int i = 0; i < y/2; i++){
            x = c[i];
            c[i] = c[z];
            c[z]=x;
            z--;
            System.out.print(c[i]);
        }
        for(int i2 = y/2; i2<y;i2++){
            System.out.print(c[i2]);
        }
//        System.out.println(c);
//        System.out.println(c.length);

    }
}

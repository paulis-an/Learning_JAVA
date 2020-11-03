package Test;

import java.util.Scanner ;
public class Test7 {
    public void hex(int x) {
        if (x < 10) {
            System.out.print("0" + x);
        } else if (x >= 10 && x < 16) {
            System.out.print("0");
            hex2(x);
        } else
            {
            while (x >= 16) {
                int a = x / 16;
                int b = (x - a * 16);
                x = x / 16;
                hex2(a);
                hex2(b);
            }
        }
    }
    public void hex2(int y){
        String c;
        if (y<10)
            System.out.print(y);
        else
            switch (y){
                case 10: c="a";
                    System .out.print(c);
                    break;
                case 11: c="b";
                    System .out.print(c);
                    break;
                case 12: c="c";
                    System .out.print(c);
                    break;
                case 13: c="d";
                    System .out.print(c);
                    break;
                case 14: c="e";
                    System .out.print(c);
                    break;
                case 15: c="f";
                    System .out.print(c);
                    break;

            }



    }

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);

        int r= scan.nextInt();
        int j=scan.nextInt();
        int b=scan.nextInt();
        Test7 z= new Test7 ();
        System .out.print('#');
        z.hex (r);
        z.hex (j);
        z.hex (b);


    }
}
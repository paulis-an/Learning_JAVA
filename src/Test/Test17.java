package Test;
import java.util.Scanner;
import java.util.Arrays;
public class Test17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
       // String [] s1 = a.split(",");
        //String [] s2 = b.split(",");
        int [] x = Arrays.stream(a.split(",")).mapToInt(Integer::parseInt).toArray();
        int [] y = Arrays.stream(b.split(",")).mapToInt(Integer::parseInt).toArray();
        int x1 = x[0]*x[1];
        int y1 = y[0]*y[1];
        if (x1>y1){
            System.out.println(x1);}
            else
            System.out.println(y1);
        }

    }


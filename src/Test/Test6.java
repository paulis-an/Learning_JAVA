package Test;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    int s1 = scan.nextInt();
    int v1 = scan.nextInt();
    int v2 = scan.nextInt();
    int s2 = 50;
    int t1 = s1/v1;
    int t2 = (s1+s2)/v2;

    if (t1>t2)
        System.out.println("Yum " +t1);
    else
        System.out.println("Meep Meep " +t2);



    }


}

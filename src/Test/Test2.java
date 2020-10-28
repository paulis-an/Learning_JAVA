package Test;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for(int a=number; a>0; a--){
            if (a % 3 == 0 || a % 10 == 3) {
               System.out.println(a);}

            else
               ;
            }
        }
    }



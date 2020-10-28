
package Test;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        do{
            if(N%3!=0 || N==0){
            System.out.println(N);}
            N--;
        }
        while (N>=0);
    }



}

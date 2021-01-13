package Test;
import java.util.Scanner;
public class Test11 {
  int summa = 0;

    public void sum(int i){

        if(i<15){
            summa +=i;
        }
        else{
            summa += i%15;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int r = scan.nextInt();
        int g = scan.nextInt();
        int y = scan.nextInt();

        Test11 t = new Test11();

        t.sum(b);
        t.sum(r);
        t.sum(g);
        t.sum(y);

        System.out.println(t.summa);



    }
}

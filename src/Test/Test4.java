package Test;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
/*
1 => Language selection
2 => Customer support
3 => Check the balance
4 => Check the loan balance
0 => Exit
*/
//введите код сюда
        DO: do{
            int x = scanner.nextInt();
            switch (x){
                case 1:
                    System.out.println("Language selection");
                    break ;
                case 2: System.out.println("Customer support");
                    break ;
                case 3:
                    System.out.println("Check the balance");
                    break ;
                case 4:
                    System.out.println ("Check the loan balance");
                    break ;
                case 0:
                    System.out.println ("Exit");
                    break DO;
                default:
                    continue DO;}

        }
        while (s <5);



    }


}


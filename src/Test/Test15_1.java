package Test;

import java.util.Scanner;

public class Test15_1 {

    public static String X(String x) {
        switch (x) {
            case "1":
                x = "one ";
                break;
            case "2":
                x = "two ";
                break;
            case "3":
                x = "three ";
                break;
            case "4":
                x = "four ";
                break;
            case "5":
                x = "five ";
                break;
            default:
                x = x + " ";
        }
        return x;
    }


    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] str = s.split(" ");
        for (String a : str) {
            System.out.print(X(a));
        }

    }

}

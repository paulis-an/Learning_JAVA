package Test;

import java.util.Scanner;

public class Test15 {

    public static void X(String x) {
        switch (x) {
            case "1":
                System.out.print("one ");
                break;
            case "2":
                System.out.print("two ");
                break;
            case "3":
                System.out.print("three ");
                break;
            case "4":
                System.out.print("four ");
                break;
            case "5":
                System.out.print("five ");
                break;
            default:
                System.out.print(x + " ");
        }
    }


        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            String[] str = s.split(" ");
            for (String a : str) {
                X(a);
                }

            }

        }




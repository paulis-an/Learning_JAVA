package Test;

import java.util.Scanner;

public class Test15_2 {
    public static String X(String x) {
        String[] num1 = {"1","2","3","4","5","6","7","8","9"};
        String[] num2 = {"one","two","three","four","five","six","seven","eight","nine"};
        for(int i =0; i<num1.length;i++){
            if(x.equals(num1[i])){
                x = num2[i];
            }
            else;

        }
        return x;
    }


    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] str = s.split(" ");
        for (String a : str) {
            System.out.print(X(a) + " ");
        }

    }

}



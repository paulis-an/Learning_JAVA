package Lession.Lession14;

import Lession.Lession5.Test;

public class Test6 {
    public void time(){
        OUT: for (int chas = 0; chas<= 23; chas++) {
        IN: for (int min=0; min<=59; min++){
            System.out.println(chas + ":" + min);
            if(min==30) {break OUT;}
        }
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}

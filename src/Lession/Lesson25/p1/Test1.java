package Lession.Lesson25.p1;
import Lession.Lesson25.Chelovek;
public class Test1 {

        public static void main (String[]args){
            Chelovek c = new Chelovek("male");
            c.setName("Oleg");
            c.setVozrast(39);
            c.setVes(88);

            System.out.println(c.getName() +   " " + c.getVozrast() + " " + c.getVes());

        }


    }


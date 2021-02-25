package Lession.Lession31;

import com.sun.xml.internal.ws.assembler.jaxws.TerminalTubeFactory;

import java.io.*;


public class Test7 {
     FileInputStream fis1, fis2;

     public void abc() {
         try {
             fis1 = new FileInputStream("test1.txt");
             try {
                fis2 = new FileInputStream("test3.txt");
             } catch (FileNotFoundException e) {
                System.out.println("test3 ne nayden");
            }
        } catch (FileNotFoundException e) {
             System.out.println("test1 ne nayden");
         } finally {
             System.out.println("finally block");
             try {
                 fis1.close();
                 fis2.close();
             } catch (IOException e){
                 System.out.println("Iskluchenie v finally blocke");
             }
         }
     }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.abc();
    }
}

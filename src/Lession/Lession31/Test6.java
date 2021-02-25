package Lession.Lession31;

import java.io.*;

public class Test6 {

    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("привет");
        try {
            File f = new File("test2.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("exp poyman");
            System.out.println(" peremennaya a v catch " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("block finally");
            System.out.println(" peremennaya a v finally " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }

}

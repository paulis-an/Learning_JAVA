package Lession.Lession31;
import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        File f = new File("test10.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            fis.read();
            System.out.println("Vse horosho");

        }
        catch (FileNotFoundException e){
            System.out.println("Oshibka   " +e);
        }
        catch (IOException e){
            System.out.println("IO Exception" + e);
        }
        finally {
            System.out.println("Eto finally");
        }

    }
}


package Lession.Lession31;

import java.io.*;

public class Test5 {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        try{
            File f =new File("test1.txt");
            System.out.println("Object File sozdalsya");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream sozdalsya");
            int counter = 0;
            while (true){
                counter++;
                result.append(fis.read());
                System.out.println("Info chitaetsya");
                if(counter==3){
                    fis.close();
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Exception 1");
        }
        catch (IOException e) {
            System.out.println("Exception 2");
        }
        finally {
            System.out.println("Eto finally");
        }
    }
}

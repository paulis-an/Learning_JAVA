package Lession.Lesson21;

import java.util.ArrayList;

public class Test4 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("Hello"));
        list.add(new String("Ok"));
        list.add(new String("Privet"));
        list.add(new String("Privet!!!"));
        list.add(new String("Ok"));
        list.add(new String("Privet"));

        for (String sb : list) {
            System.out.print(sb + " ");

        }
        System.out.println();
        System.out.println(list.indexOf("Ok"));
        System.out.println();
        System.out.println(list.lastIndexOf("Ok"));
        System.out.println(list.size());
        System.out.println(list.contains("Privet"));
        System.out.println(list.toString());
        list.clear();
        System.out.println(list.isEmpty());

    }
}

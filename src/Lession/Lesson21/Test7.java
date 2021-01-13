package Lession.Lesson21;

import java.util.ArrayList;

import java.util.Iterator;
public class Test7 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";


        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        Iterator <String> it = list1.iterator();
        while (it.hasNext()){
            it.next();
            it.remove();
            System.out.print(list1);
        }
        System.out.println();
        for (int i=0;i<list1.size();i++){
            System.out.print(list1.get(i));
        }
    }
}
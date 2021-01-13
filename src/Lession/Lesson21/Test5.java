package Lession.Lesson21;

import Lession.Lession10.p1.A;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Test5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        System.out.println(list1 == list2);
        System.out.println(list1.get(0) == list2.get(0));


        Object[] array1 = list1.toArray();
        for (Object o: array1){
            System.out.print(o);
        }

        StringBuilder[] array2 = list1.toArray(new StringBuilder[10]);
        for(StringBuilder sb: array2){
            System.out.print(sb);

        }
        System.out.println();
        System.out.println(array2.length);
    }
}

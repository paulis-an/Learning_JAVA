package Lession.Lesson21;
import java.util.ArrayList;
import java.util.SplittableRandom;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("poka");
        list.add("poka");
        list.add("ok");
        list.add(1,"hello");
        for(String x: list)
        System.out.print(x +" ");
        System.out.println();
        System.out.println(list.get(2));

        list.set(2,"!!!");
        for (String s: list){
            System.out.print(s +" ");
        }
        System.out.println();
        list.remove("!!!");
        for (String s: list){
            System.out.print(s +" ");
        }
        System.out.println();

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Ivanov");
        list.addAll(list2);
        for (String s: list){
            System.out.print(s +" ");
        }
        System.out.println();

        list.addAll(1, list2);
        for (String s: list){
            System.out.print(s +" ");
        }

        System.out.println();
        System.out.println();
        list.clear();
        for (String s: list){
            System.out.print(s +" ");
        }
    }
}

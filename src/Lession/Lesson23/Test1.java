package Lession.Lesson23;
import java.util.ArrayList;
import java.util.List;

public class Test1 {



    public static void main(String[] args) {

    ArrayList <String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1 = " +al1);

        ArrayList <String> al2 = new ArrayList<>();
        al2.add("one");

        al2.add("three");

        al2.add("five");
        al2.add("ten");
        System.out.println("al2 = " +al2);

//        al1.removeAll(al2);
//        System.out.println(al1);


        al1.retainAll(al2);
        System.out.println(al1);

        boolean result = al1.containsAll(al2);
        System.out.println(result);

        List <String> sl1 = al1.subList(0, 3);
        System.out.println(sl1);
        sl1.add("ten");
        System.out.println(sl1);

        Object [] array = al1.toArray();
        for (Object a: array
             ) {
            System.out.print(a);
        }
        System.out.println();
        String [] array2 = al1.toArray(new String[5]);
        for (String b: array2
             ) {
            System.out.println(b);
        }


    }
}

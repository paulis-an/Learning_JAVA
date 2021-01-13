package Lession.Lession29;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        Long l = 50l;
        int a = list.get(0);
        System.out.println(a);
        Integer b = new Integer(10);
        int c = b;
        System.out.println(c);
        switch (b){}

        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";
        int x = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        double d = Double.parseDouble(s3);
        System.out.println(s1 + s2 +d) ;

        Integer i3 = Integer.valueOf(10);
        Double d3 = Double.valueOf(s3);
        System.out.println(i3);
        System.out.println(d3);
    }
}

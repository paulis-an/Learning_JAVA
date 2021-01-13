package Lession.Lesson19;

public class Test7 {
    public static void main(String[] args) {
        char [] array = {'p','r','i','v','e','t'};
        String s = new String(array);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("ok");
        sb.append(array);
        System.out.println(sb);

        sb.append(array,2,4);
        System.out.println(sb);


        sb = new StringBuilder("poka");
        sb.insert(1,array,1,3);
        System.out.println(sb);
    }
}

package Lession.Lession28;

public class Test6 {
    public static void main(String[] args) {
        String[] array1 = {"privet", "poka"};
        Object[] array2 = array1;
        String[] array3 = (String[]) array2;
       // array2[0] = new StringBuilder("ok");
        for (String a : array3) {
            System.out.println(a);
        }
    }
}

package Test;

public class Test12 {

    public static void main(String[] args) {
        String st = "Pavel1978An11";
        String st1 = st.replaceAll("[^A-Za-z]", "");
        String st2 = st.replaceAll("[^0-9]", "");
        System.out.println(st1);
        System.out.println(st2);
    }
}

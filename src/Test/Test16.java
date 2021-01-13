package Test;

public class Test16 {

    public static void main(String[] args) {
        String result="17 18 19 ";

//        result = result.replaceFirst("^,", "");
//        System.out.println(result);

        String[] arr = result.split(" ");
        for (String a: arr){
            System.out.println(a);
        }
    }
}

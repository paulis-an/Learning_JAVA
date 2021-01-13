package Lession.Lesson20;

public class Test8 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for(int i=0; i<array.length; i++) {
            array[i] = i * 10;
        }
        for(int j: array){
            System.out.println(j);
        }

    }
}

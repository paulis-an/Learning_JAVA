package Lession.Lesson19;

public class Test5 {

    public static void main(String[] args) {
        int array1[] = {1, 9, 3, -8, 0, 5, 4, 1};
        int array2[] = {1, 9, 3, -8, 0, 5, 4, 1};
        array1[1]= 0;
        for (int i = 0; i < array1.length; i++) {

            System.out.print(array1[i]);

        }

        int array3[] = array2;
        System.out.println();
        System.out.println(array3 == array2);
        System.out.println(array1.equals(array3));
    }
}

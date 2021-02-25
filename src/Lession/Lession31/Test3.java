package Lession.Lession31;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {4, 8, 1};
        System.out.println("Massiv");

        try {
            System.out.println(array[5]);
            System.out.println("Vsem poka   ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Byl poyman Exception   " + e);
        }
        finally {
            System.out.println("Eto finally block");
        }
    }
}

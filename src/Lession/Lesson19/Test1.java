package Lession.Lesson19;

public class Test1 {
    public static void main(String[] args) {
        int [] array1;
        String [] array2;
        double[] [] array3;
        int array10 [] [];


        array1 = new int[8];
        array2 = new String [4];
        array3 = new double[4][2];
        array10 = new int [3] [];

        System.out.println(array10.length);

        array2[0] = "privet";
        array2[1] = "poka";

        array3[0][1] = 3.14;
        array3[1][1] = .22;

        double [] array5;
        array5 = new double[2];
        array5[0]= 2.5;
        array5[1]= 3.5;

        array3[1]=array5;

        System.out.println(array3[1][1]);




    }

}

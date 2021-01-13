package Lession.Lesson19;

public class Test6 {

    public static void maxMin(double [] array){
        double max = array[0];
        double min = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i]>max) {
                max=array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
            }
        System.out.println("Min = " + min + "; Max = " + max);
    }

    public static void main(String[] args) {
        double [] array1 = {1.1, 6.9, 18.2, 6.2, -5.0, 18.4};
        maxMin(array1);
        maxMin(new double[] {1.25,2.51,6.254,8.139,0.125,16,32.7});
    }

}

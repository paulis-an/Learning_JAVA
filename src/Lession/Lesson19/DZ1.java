package Lession.Lesson19;
import java.util.Arrays;
public class DZ1 {
    public static int[] sortirovka(int[] array){
        //for (int i = 0; i<array.length; i++){
            Arrays.sort(array);
            return array;
        }

    public static void main(String[] args) {
        int [] array1 = sortirovka(new int[] {-18,1,6,18,5,14,325,16,-2,4,75,58});

        for(int i=0; i< array1.length; i++){
            System.out.println(array1[i]);
        }
    }
    }


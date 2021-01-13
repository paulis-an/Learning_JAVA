package Lession.Lesson19;



public class DZ11 {
    public static int[] sortirovka(int[] array){
        int n=0;
        for(int i = 0; i< array.length; i++){
            int min = array[i];
            int index = i;
            for(int j =i+1;j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
                if(i!=index){
                        n = array[i];
                        array[i] = min;
                        array[index] = n;


            }


        }
        return array;
    }

    public static void main(String[] args) {
        int [] array1 = sortirovka(new int[] {38,6,-18,5,14,325,-16,2,4,14,-75,58});

        for(int i=0; i< array1.length; i++){
            System.out.println(array1[i]);
        }
    }
}
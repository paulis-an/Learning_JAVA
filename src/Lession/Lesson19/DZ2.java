package Lession.Lesson19;

public class DZ2 {

    public static void main(String[] args) {
        DZTest print = new DZTest();
        String[][] array2 = {{"privet", "ok","poka","3"},{"www", "drug", "sun"}, {"hello","good"}};
        print.showArray(array2);
    }
}
class DZTest{
    public void showArray(String [][] array){
        System.out.print("{");
        for (int i = 0; i<array.length; i++){
            System.out.print('{');
            for (int j = 0; j<array[i].length; j++){
                if(j != array[i].length -1){
                    System.out.print(array[i][j] + ", ") ;
                }
                else
                    System.out.print(array[i][j]) ;
            }
            if (i != array.length -1){
                System.out.print("}, ");
            }
            else
                System.out.print("}");
        }
        System.out.print("}");
    }

}

package Test;

public class Test9 {
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        int k;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                k = matrix[i][j];
                System.out.print(k);
                            }
            System.out.println();
        }
    }
}

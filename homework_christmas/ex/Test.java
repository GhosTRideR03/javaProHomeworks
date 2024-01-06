package javaProHomeworks.homework_christmas.ex;

public class Test {

    public static void main(String[] args) {

        int[][] matrix = {{2, 3, 5, 6, 7},
                {2, 4, 6, 8, 9},
                {3, 5, 8, 10, 12}};
        System.out.println(isContains(matrix, 1));
    }

    static boolean isContains(int[][] matrix, int num) {
        int column = 0;
        int row = matrix[0].length - 1;
        while (column != matrix.length && row != -1) {
            if (matrix[column][row] == num) {
                return true;
            }
            if (matrix[column][row] < num) {
                column++;
            } else {
                row--;
            }
        }
        return false;
    }
}

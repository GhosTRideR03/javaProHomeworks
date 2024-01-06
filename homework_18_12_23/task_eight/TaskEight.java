package javaProHomeworks.homework_18_12_23.task_eight;

public class TaskEight {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2,}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        printMatrix(matrix);

        matrixTransposer(new Process() {
            @Override
            public void matrixProcess(int[][] arr) {
                int line = matrix.length;
                int column = matrix[0].length;
                int[][] transMatrix = new int[column][line];

                for (int i = 0; i < line; i++) {
                    for (int j = 0; j < column; j++) {
                        transMatrix[j][i] = matrix[i][j];
                    }
                }
                printMatrix(transMatrix);
            }
        }, matrix);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] line : matrix) {
            for (int element : line) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    static void matrixTransposer(Process processor, int[][] matrix) {
        processor.matrixProcess(matrix);
    }
}

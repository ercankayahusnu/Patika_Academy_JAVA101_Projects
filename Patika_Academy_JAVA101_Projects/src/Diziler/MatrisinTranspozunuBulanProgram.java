package Diziler;

public class MatrisinTranspozunuBulanProgram {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Original Matrix 1:");
        printMatrix(matrix1);
        int[][] transpose1 = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        printMatrix(transpose1);

        System.out.println("Original Matrix 2:");
        printMatrix(matrix2);
        int[][] transpose2 = transposeMatrix(matrix2);
        System.out.println("Transpose of Matrix 2:");
        printMatrix(transpose2);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}

    

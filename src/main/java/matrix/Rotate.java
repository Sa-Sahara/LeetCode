package matrix;

public class Rotate {
    public void rotate(int[][] matrix) {
        if (matrix.length == 1) return;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < i; j++){
                matrix[i][j] += matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] -= matrix[j][i];
                System.out.print(matrix[i][j] + " ");
            }
        }

        int rowLen = matrix[0].length;
        int midRow = rowLen / 2 - rowLen % 2;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j <= midRow / 2; j++){
                matrix[i][j] += matrix[i][rowLen - j - 1];
                matrix[i][rowLen - j - 1] = matrix[i][j] - matrix[i][rowLen - j - 1];
                matrix[i][j] -= matrix[i][rowLen - j - 1];
            }
        }
    }
}

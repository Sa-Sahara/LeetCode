package matrix;

public class Zeros {
    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        int row, col;
        for (row = 0; row < rows.length; row++){
            for (col = 0; col < cols.length; col++){
                if (matrix[row][col] == 0){
                    rows[row] = true;
                    cols[col] = true;
                }
            }
        }

        for (row = 0; row < matrix.length; row++){
            for (col = 0; col < matrix[0].length; col++){
                if (rows[row] || cols[col]) {
                    matrix[row][col] = 0;
                }
            }
        }
    }
}

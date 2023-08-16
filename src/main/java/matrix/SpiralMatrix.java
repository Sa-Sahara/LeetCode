package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minRow = 0;
        int maxRow = matrix.length - 1;
        int minCol = 0;
        int maxCol = matrix[0].length - 1;
        List<Integer> list = new ArrayList<>();

        while (minRow <= maxRow && minCol <= maxCol) {
            for(int i = minCol; i <= maxCol; i++){
                list.add(matrix[minRow][i]);
            }
            if (++minRow > maxRow) break;

            for(int i = minRow; i <= maxRow; i++){
                list.add(matrix[i][maxCol]);
            }
            if (minCol > --maxCol) break;

            for(int i = maxCol; i >= minCol; i--){
                list.add(matrix[maxRow][i]);
            }
            if (minRow > --maxRow) break;

            for(int i = maxRow; i >= minRow; i--){
                list.add(matrix[i][minCol]);
            }
            if (++minCol > maxCol) break;
        }

        return list;
    }
}

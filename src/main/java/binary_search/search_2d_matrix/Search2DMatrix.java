package binary_search.search_2d_matrix;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix[0].length - 1;
        int maxIndex = end;
        int row = searchRow(matrix, target);
        if (row < 0) return false;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (matrix[row][mid] < target) {
                start = mid + 1;
            } else if (matrix[row][mid] > target) {
                end = mid - 1;
            } else return true;
        }
        return false;
    }

    public int searchRow(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        int lastInRow = matrix[0].length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (matrix[mid][lastInRow] < target) {
                start = mid + 1;
            } else {
                if (matrix[mid][0] <= target) return mid;
                end = mid - 1;
            }
        }
        return -1;
    }
}

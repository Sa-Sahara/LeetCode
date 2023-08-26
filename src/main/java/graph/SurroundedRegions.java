package graph;

public class SurroundedRegions {
    public void solve(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (row == 0 || row == board[0].length - 1
                        || col == 0 || col == board.length - 1)
                    if (board[row][col] == 'O') {
                        goFromBoarderRecursive(board, col, row);
                    }
            }
        }

        mark(board);
    }

    private void goFromBoarderRecursive(char[][] board, int col, int row) {
        if (col < 0 || row < 0
                || col >= board.length
                || row >= board[0].length)
            return;

        if (board[row][col] != 'O') {
            return;
        }

        board[row][col] = 'W';
        goFromBoarderRecursive(board, col - 1, row);
        goFromBoarderRecursive(board, col + 1, row);
        goFromBoarderRecursive(board, col, row - 1);
        goFromBoarderRecursive(board, col, row + 1);
    }

    public void mark(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                } else if (board[row][col] == 'W') {
                    board[row][col] = 'O';
                }
            }
        }
    }
}
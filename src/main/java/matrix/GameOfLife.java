package matrix;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        nextGen(board);
    }

    public void markSurvivors(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int counter = 0;
                if (i - 1 >= 0) {
                    counter = board[i - 1][j]  % 2 == 1 ? ++counter : counter;
                    if (j - 1 >= 0) counter = board[i - 1][j - 1] % 2 == 1 ? ++counter : counter;
                    if (j + 1 < board[0].length) counter = board[i - 1][j + 1]  % 2 == 1 ? ++counter : counter;
                }

                if (i + 1 < board.length) {
                    counter = board[i + 1][j]  % 2 == 1 ? ++counter : counter;
                    if (j - 1 >= 0) counter = board[i + 1][j - 1]  % 2 == 1 ? ++counter : counter;
                    if (j + 1 < board[0].length) counter = board[i + 1][j + 1]  % 2 == 1 ? ++counter : counter;
                }

                if (j - 1 >= 0) counter = board[i][j - 1]  % 2 == 1 ? ++counter : counter;
                if (j + 1 < board[0].length) counter = board[i][j + 1]  % 2 == 1 ? ++counter : counter;

                if (counter <= 3) {
                    if (board[i][j] + counter >= 3)
                        board[i][j] += 2;
                }
            }
        }
    }

    public void nextGen(int[][] board) {
        markSurvivors(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = board[i][j] / 2 == 1
                        ? 1
                        : 0;
            }
        }
    }
}
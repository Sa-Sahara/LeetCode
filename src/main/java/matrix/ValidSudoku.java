package matrix;

import java.util.HashMap;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] sectors = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (rows[board[i][j] - '1'][i] != 0) return false;
                if (cols[board[i][j] - '1'][j] != 0) return false;
                ++rows[board[i][j] - '1'][i];
                ++cols[board[i][j] - '1'][j];

                String tmp = "" + i / 3 + j / 3;

                switch (tmp) {
                    case "00" -> {
                        if (sectors[board[i][j] - '1'][0]++ != 0) return false;
                    }
                    case "01" -> {
                        if (sectors[board[i][j] - '1'][1]++ != 0) return false;
                    }
                    case "02" -> {
                        if (sectors[board[i][j] - '1'][2]++ != 0) return false;
                    }
                    case "10" -> {
                        if (sectors[board[i][j] - '1'][3]++ != 0) return false;
                    }
                    case "11" -> {
                        if (sectors[board[i][j] - '1'][4]++ != 0) return false;
                    }
                    case "12" -> {
                        if (sectors[board[i][j] - '1'][5]++ != 0) return false;
                    }
                    case "20" -> {
                        if (sectors[board[i][j] - '1'][6]++ != 0) return false;
                    }
                    case "21" -> {
                        if (sectors[board[i][j] - '1'][7]++ != 0) return false;
                    }
                    case "22" -> {
                        if (sectors[board[i][j] - '1'][8]++ != 0) return false;
                    }
                }
            }
        }
        return true;
    }
}

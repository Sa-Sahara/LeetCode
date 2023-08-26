package org.example;

import graph.SurroundedRegions;
import org.junit.Test;

public class SurroundedRegionsTest {
    SurroundedRegions s = new SurroundedRegions();

    @Test
    public void test(){
//        [['X','X','X','X'],['X','O','O','X'],['X','X','O','X'],['X','O','X','X']]
        char[][] board = new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        s.solve(board);

        for (int col = 0; col < board.length; col++){
            for(int row = 0; row < board[0].length; row++){
                System.out.print(board[col][row] + " ");
            }
            System.out.println();
        }
    }
}

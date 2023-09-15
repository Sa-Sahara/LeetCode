package org.example;

import matrix.GameOfLife;
import org.junit.Assert;
import org.junit.Test;

public class GameOfLifeTest {
    GameOfLife g = new GameOfLife();

    @Test
    public void test1(){
        int[][] res = new int[][]{{1,1},{1,1}};
        int[][] test = new int[][]{{1,1},{1,0}};
        g.gameOfLife(test);
        Assert.assertArrayEquals(res, test);
    }
}

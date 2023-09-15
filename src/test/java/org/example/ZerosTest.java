package org.example;

import matrix.Zeros;
import org.junit.Assert;
import org.junit.Test;

public class ZerosTest {
    Zeros z = new Zeros();

    @Test
    public void test1() {
        int[][] arr1 = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        int[][] arr2 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        z.setZeroes(arr2);
        Assert.assertArrayEquals(arr1, arr2);
    }

    @Test
    public void test2() {
        int[][] arr1 = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 4}, {0, 0, 0, 0}, {0, 0, 0, 3}, {0, 0, 0, 0}};
        int[][] arr2 = new int[][]{{0, 0, 0, 5}, {4, 3, 1, 4}, {0, 1, 1, 4}, {1, 2, 1, 3}, {0, 0, 1, 1}};
        z.setZeroes(arr2);
        Assert.assertArrayEquals(arr1, arr2);
    }
}

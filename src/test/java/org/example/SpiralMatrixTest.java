package org.example;

import matrix.SpiralMatrix;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SpiralMatrixTest {
    SpiralMatrix s = new SpiralMatrix();

    @Test
    public void test1(){
        int[][] matrix = new int[1][3];
        matrix[0][0] = 6;
        matrix[0][1] = 7;
        matrix[0][2] = 9;

        Assert.assertEquals(List.of(6, 7, 9), s.spiralOrder(matrix));
    }
}

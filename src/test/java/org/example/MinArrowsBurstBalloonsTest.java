package org.example;

import intervals.min_arrays_balloons.MinArrowsBurstBalloons;
import org.junit.Assert;
import org.junit.Test;

public class MinArrowsBurstBalloonsTest {

    MinArrowsBurstBalloons m = new MinArrowsBurstBalloons();

    @Test
    public void test(){
        int[][] points = new int[][]{{10,16},{2,8},{1,6},{7,12}};
        Assert.assertEquals(2, m.findMinArrowShots(points));
    }
}

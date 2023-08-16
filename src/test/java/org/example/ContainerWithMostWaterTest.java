package org.example;

import org.junit.Assert;
import org.junit.Test;
import two_pointers.container_with_most_water.ContainerWithMostWater;

public class ContainerWithMostWaterTest {
    ContainerWithMostWater c = new ContainerWithMostWater();

    @Test
    public void test1() {
        Assert.assertEquals(49, c.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    public void test2() {
        Assert.assertEquals(17, c.maxArea(new int[]{2, 3, 4, 5, 18, 17, 6}));
    }
}

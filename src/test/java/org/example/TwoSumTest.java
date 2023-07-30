package org.example;

import org.junit.Assert;
import org.junit.Test;
import hashmap.two_sum.TwoSum;

public class TwoSumTest {
    TwoSum t = new TwoSum();

    @Test
    public void Test1() {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
        Assert.assertArrayEquals(
                new int[]{0, 1},
                t.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void Test2() {
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
        Assert.assertArrayEquals(
                new int[]{1, 2},
                t.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    public void Test3() {
//        Input: nums = [3,3], target = 6
//        Output: [0,1]
        Assert.assertArrayEquals(
                new int[]{0, 1},
                t.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    public void Test4() {
        Assert.assertArrayEquals(
                new int[]{1, 3},
                t.twoSum(new int[]{1, 3, 6, 3}, 6));
    }

    @Test
    public void Test5() {
        Assert.assertArrayEquals(
                new int[]{0, 2},
                t.twoSum(new int[]{-3, 4, 3, 90}, 0));
    }
}

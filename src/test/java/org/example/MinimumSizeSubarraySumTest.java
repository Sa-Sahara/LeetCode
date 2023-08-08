package org.example;

import org.junit.Assert;
import org.junit.Test;
import sliding_window.MinimumSizeSubarraySum;

public class MinimumSizeSubarraySumTest {
    MinimumSizeSubarraySum m = new MinimumSizeSubarraySum();

    @Test
    public void test1() {
//        Input: target = 7, nums = [2,3,1,2,4,3]
//        Output: 2
        Assert.assertEquals(2, m.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}

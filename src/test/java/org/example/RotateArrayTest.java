package org.example;

import array_string.rotate_arr.RotateArray;
import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {
    RotateArray r = new RotateArray();

    @Test
    public void test1() {
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
        int[] initial = new int[]{1, 2, 3, 4, 5, 6, 7};
        r.rotate(initial, 3);
        Assert.assertArrayEquals(
                new int[]{5, 6, 7, 1, 2, 3, 4},
                initial);
    }
}

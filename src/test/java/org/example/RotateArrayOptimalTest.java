package org.example;

import array_string.rotate_arr.RotateArray;
import array_string.rotate_arr.RotateArrayOptimal;
import org.junit.Assert;
import org.junit.Test;

public class RotateArrayOptimalTest {
    RotateArrayOptimal r = new RotateArrayOptimal();

    @Test
    public void test1() {
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
        int[] initial = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        r.rotate(initial, 3);
        Assert.assertArrayEquals(
                new int[]{5, 6, 7, 0, 1, 2, 3, 4},
                initial);
    }
}

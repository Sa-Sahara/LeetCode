package org.example;

import array_string.majority_element.Optimal;
import org.junit.Assert;
import org.junit.Test;

public class OptimalMajorityElementTest {
    Optimal m = new Optimal();

    @Test
    public void test1() {
//        Input: nums = [3,2,3]
//        Output: 3
        Assert.assertEquals(3, m.majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    public void test2() {
//        Input: nums = [2,2,1,1,1,2,2]
//        Output: 2
        Assert.assertEquals(
                2,
                m.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    public void test3() {
//        Input: nums = [2,2,2,2,1,2,2]
//        Output: 2
        Assert.assertEquals(
                2,
                m.majorityElement(new int[]{2, 2, 2, 2, 1, 2, 2}));
    }

    @Test
    public void test4() {
//        Input: nums = [2]
//        Output: 2
        Assert.assertEquals(
                2,
                m.majorityElement(new int[]{2}));
    }

    @Test
    public void test5() {
//        Input: nums = [2, 2]
//        Output: 2
        Assert.assertEquals(
                2,
                m.majorityElement(new int[]{2, 2}));
    }
}
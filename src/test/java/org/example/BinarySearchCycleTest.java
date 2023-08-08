package org.example;

import binary_search.search_insert.BinarySearchCycle;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchCycleTest {
    BinarySearchCycle b = new BinarySearchCycle();

    @Test
    public void test0() {
//        Input: nums = [1,3,5,6], target = 0
//        Output: 0

        Assert.assertEquals(0, b.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }

    @Test
    public void test1() {
//        Input: nums = [1,3,5,6], target = 1
//        Output: 0

        Assert.assertEquals(0, b.searchInsert(new int[]{1, 3, 5, 6}, 1));
    }

    @Test
    public void test2() {
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1

        Assert.assertEquals(1, b.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    public void test3() {
//        Input: nums = [1,3,5,6], target = 3
//        Output: 1

        Assert.assertEquals(1, b.searchInsert(new int[]{1, 3, 5, 6}, 3));
    }

    @Test
    public void test4() {
//        Input: nums = [1,3,5,6], target = 4
//        Output: 2

        Assert.assertEquals(2, b.searchInsert(new int[]{1, 3, 5, 6}, 4));
    }

    @Test
    public void test5() {
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2

        Assert.assertEquals(2, b.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    public void test6() {
//        Input: nums = [1,3,5,6], target = 6
//        Output: 3

        Assert.assertEquals(3, b.searchInsert(new int[]{1, 3, 5, 6}, 6));
    }


    @Test
    public void test7() {
//        Input: nums = [1,3,5,6], target = 7
//        Output: 1

        Assert.assertEquals(4, b.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}

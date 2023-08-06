package org.example;

import math.add_one.AddOne;
import org.junit.Assert;
import org.junit.Test;

public class AddOneTest {
    AddOne a = new AddOne();

    @Test
    public void test1(){
//        Input: digits = [1,2,3]
//        Output: [1,2,4]
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,4};

        Assert.assertArrayEquals(arr2, a.plusOne(arr1));
    }

    @Test
    public void test2(){
//        Input: digits = [1,2,9]
//        Output: [1,2,1,0]
        int[] arr1 = new int[]{1,2,9};
        int[] arr2 = new int[]{1,3,0};

        Assert.assertArrayEquals(arr2, a.plusOne(arr1));
    }

    @Test
    public void test3(){
//        Input: digits = [9,9,9]
//        Output: [1,0,0,0]
        int[] arr1 = new int[]{9,9,9};
        int[] arr2 = new int[]{1,0,0,0};

        Assert.assertArrayEquals(arr2, a.plusOne(arr1));
    }
}

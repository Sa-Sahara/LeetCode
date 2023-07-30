package org.example;

import hashmap.happy_number.HappyNumber;
import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {
    HappyNumber h = new HappyNumber();

    @Test
    public void test1(){
        Assert.assertTrue(h.isHappy(1));
    }

    @Test
    public void test2(){
        Assert.assertFalse(h.isHappy(2));
    }

    @Test
    public void test3(){
        Assert.assertFalse(h.isHappy(3));
    }

    @Test
    public void test4(){
        Assert.assertFalse(h.isHappy(4));
    }

    @Test
    public void test5(){
        Assert.assertFalse(h.isHappy(5));
    }

    @Test
    public void test6(){
        Assert.assertFalse(h.isHappy(6));
    }

    @Test
    public void test7(){
        Assert.assertTrue(h.isHappy(7));
    }

    @Test
    public void test8(){
        Assert.assertFalse(h.isHappy(8));
    }

    @Test
    public void test10(){
//        Input: n = 19
//        Output: true
//        Explanation:
//        12 + 92 = 82
//        82 + 22 = 68
//        62 + 82 = 100
//        12 + 02 + 02 = 1
        Assert.assertTrue(h.isHappy(19));
    }

    @Test
    public void test11(){
//        Input: n = 2
//        Output: false
        Assert.assertFalse(h.isHappy(2));
    }
}

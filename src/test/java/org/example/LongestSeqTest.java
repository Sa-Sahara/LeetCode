package org.example;

import hashmap.longest_seq.LongestSeq;
import org.junit.Assert;
import org.junit.Test;

public class LongestSeqTest {
    LongestSeq l = new LongestSeq();

    @Test
    public void test() {
        Assert.assertEquals(4, l.longestConsecutive(new int[]{
                100, 4, 200, 1, 3, 2
        }));
    }

    @Test
    public void test1() {
        Assert.assertEquals(9, l.longestConsecutive(new int[]{
                0,3,7,2,5,8,4,6,0,1
        }));
    }

    @Test
    public void test2() {
        Assert.assertEquals(8, l.longestConsecutive(new int[]{
                4,2,2,-4,0,-2,4,-3,-4,-4,-5,1,4,-9,5,0,6,-8,-1,-3,6,5,-8,-1,-5,-1,2,-9,1
        }));
    }
}

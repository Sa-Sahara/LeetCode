package org.example;

import array_string.h_index.HIndex;
import org.junit.Assert;
import org.junit.Test;

public class HIndexTest {
    HIndex h = new HIndex();

    @Test
    public void test1() {
        Assert.assertEquals(2, h.hIndex(new int[]{4, 4, 0, 0}));
    }
}

package org.example;

import array_string.candy.Candy;
import org.junit.Assert;
import org.junit.Test;

public class CandyTest {
    Candy c = new Candy();

    @Test
    public void test(){
        int[] ratings= new int[]{1,0,2};
        Assert.assertEquals(5, c.candy(ratings));
    }
}

package org.example;

import org.junit.Assert;
import org.junit.Test;
import sell_stock.OptimalSellStock;

public class OptimalSellStockTest {
    OptimalSellStock o = new OptimalSellStock();

    @Test
    public void Test1() {
        int[] arr = new int[]{7, 1, 5, 3, 6, 4};

        Assert.assertEquals(5, o.maxProfit(arr));
    }

    @Test
    public void Test2() {
        int[] arr = new int[]{7, 6, 4, 3, 1};

        Assert.assertEquals(0, o.maxProfit(arr));
    }
}

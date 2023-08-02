package org.example;

import divideConquer.SortedArrayToBST;
import org.junit.Test;

public class SortedArrayToBSTTest {
    SortedArrayToBST s = new SortedArrayToBST();

    @Test
    public void test1() {
        s.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
    }
}

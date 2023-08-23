package org.example;

import intervals.merge_intervals.MergeIntervals;
import org.junit.Test;

public class MergeIntervalsTest {
    MergeIntervals m = new MergeIntervals();

    @Test
    public void test1(){
        m.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
    }
}

package org.example;

import intervals.insert_intervals.InsertInterval;
import org.junit.Assert;
import org.junit.Test;

public class InsertIntervalTest {

    InsertInterval i = new InsertInterval();

    @Test
    public void test1() {
//        Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
//        Output: [[1,2],[3,10],[12,16]]
//        Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
        int[][] intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = new int[]{4, 8};
        int[][] result = new int[][]{{1, 2}, {3, 10}, {12, 16}};

        Assert.assertArrayEquals(result, i.insert(intervals, newInterval));
    }
}

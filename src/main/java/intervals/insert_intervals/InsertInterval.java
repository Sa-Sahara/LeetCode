package intervals.insert_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int[][] allIntervals = new int[intervals.length + 1][];
        System.arraycopy(allIntervals, 0, intervals, 0, intervals.length);
        allIntervals[allIntervals.length - 1] = newInterval;
        Arrays.sort(allIntervals, Comparator.comparingInt(a -> a[0]));

        return list.toArray(new int[list.size()][]);
    }
}
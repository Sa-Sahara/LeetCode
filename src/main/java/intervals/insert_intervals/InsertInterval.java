package intervals.insert_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval { //todo: find optimal solution
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int[][] allIntervals = new int[intervals.length + 1][];
        System.arraycopy(intervals, 0, allIntervals, 0, intervals.length);
        allIntervals[allIntervals.length - 1] = newInterval;
        Arrays.sort(allIntervals, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < allIntervals.length; i++){
            if (i == 0){
                list.add(allIntervals[i]);
            } else {
                int[] tmp = list.get(list.size() - 1);
                if (allIntervals[i][0] > tmp[1]) {
                    list.add(allIntervals[i]);
                } else {
                    tmp[0] = Math.min(tmp[0], allIntervals[i][0]);
                    tmp[1] = Math.max(tmp[1], allIntervals[i][1]);
                    list.set(list.size() - 1, tmp);
                }
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
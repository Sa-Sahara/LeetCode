package intervals.min_arrays_balloons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinArrowsBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt((i) -> i[0]));
        int arrow = 0;
        List<int[]> balloons = new ArrayList<>();
        int limit = points[0][1];
        for(int i = 0; i < points.length; i++){
            if (i > 0){
                if (points[i][0] <= limit){
                    limit = Math.min(limit, points[i][1]);
                    continue;
                } else {
                    limit = points[i][1];
                }
            }
            ++arrow;
        }
        return arrow;
    }
}

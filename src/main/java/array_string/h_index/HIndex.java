package array_string.h_index;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        int[] copy = citations;
        Arrays.sort(copy);
        int maxCit = 0;

        for (int i = copy.length - 1; i >= 0; i--){
            if (copy[i] <= (copy.length - i)) {
                return Math.max(copy[i], maxCit);
            } else {
                maxCit = Math.max(maxCit, copy.length - i);
            }
        }
        return maxCit;
    }
}

package summary_ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) return result;
        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }

        int indexPrev = 0;
        long prev = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] - prev) > (i - indexPrev)) {
                if (i - indexPrev != 1) {
                    result.add(prev + "->" + nums[i - 1]);
                } else {
                    result.add("" + nums[i - 1]);
                }

                if (i == nums.length - 1) {
                    result.add("" + nums[i]);
                    continue;
                }

                prev = nums[i];
                indexPrev = i;

            } else if (i == nums.length - 1) {
                result.add(prev + "->" + nums[i]);
            }
        }
        return result;
    }
}

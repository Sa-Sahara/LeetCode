package intervals.summary_ranges;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) return result;
        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }

        StringBuilder sb = new StringBuilder();
        int indexPrev = 0;
        long prev = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sb.append(nums[i]);
                continue;
            }

            if ((nums[i] - prev) > (i - indexPrev)) {
                if (i - indexPrev != 1) {
                    sb.append("->").append(nums[i - 1]);
                }
                result.add(sb.toString());
                sb.setLength(0);
                sb.append(nums[i]);
                prev = nums[i];
                indexPrev = i;
            } else if (i == nums.length - 1) {
                sb.append("->").append(nums[i]);
            }
            if (i == nums.length - 1) {
                result.add(sb.toString());
            }
        }
        return result;
    }
}

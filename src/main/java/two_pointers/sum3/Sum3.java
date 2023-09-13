package two_pointers.sum3;

import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = len - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (sum < 0) {
                    start++;
                } else if (sum > 0) {
                    end--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[start], nums[end]);
                    ans.add(temp);
                    start++;
                    end--;
                    while (end > start && nums[end] == nums[end + 1]) end--;
                    while (end > start && nums[start] == nums[start - 1]) start++;
                }
            }
        }
        return ans;
    }
}
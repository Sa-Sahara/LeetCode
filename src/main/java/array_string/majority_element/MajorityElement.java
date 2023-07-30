package array_string.majority_element;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length <= 2) return nums[0];

        int max = nums[0];
        int maxFrequency = 1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.putIfAbsent(nums[i], 1) != null) {
                int tmpFrequency = map.get(nums[i]) + 1;

                if (tmpFrequency > maxFrequency) {
                    max = nums[i];
                    maxFrequency = tmpFrequency;
                }
                if (maxFrequency > nums.length / 2 + 1) break;
                map.put(nums[i], tmpFrequency);
            }
        }
        return max;
    }
}

package delete_from_array;

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0, cursor = 0; cursor < nums.length; i++, cursor++) {
            if (nums[cursor] != val) {
                nums[i] = nums[cursor];
                k = i + 1;
            } else {
                while (cursor < nums.length && nums[cursor] == val) {
                    cursor++;
                }
                if (cursor < nums.length) {
                    nums[i] = nums[cursor];
                    k = i + 1;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}

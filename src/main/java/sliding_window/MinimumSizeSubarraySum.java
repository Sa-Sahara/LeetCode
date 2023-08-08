package sliding_window;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = nums[0];
        int minL = nums.length + 1;

        while (end < nums.length) {
            if (sum > target) {
                sum -= nums[start];
                if (start == end) end++;
                start++;
            } else if (sum < target){
                end++;
                if(end == nums.length) break;
                sum += nums[end];
            } else {
                if (end - start + 1 < minL){
                    minL = end - start + 1;
                }
                sum -= nums[start++];
            }
        }

        if (minL != nums.length + 1) return minL;
        return 0;
    }
}
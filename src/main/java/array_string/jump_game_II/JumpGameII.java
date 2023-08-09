package array_string.jump_game_II;

public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0, currEnd = 0, currFarthest = 0;
        for(int i = 0; i < nums.length - 1; i ++) {
            currFarthest = Math.max(currFarthest, i + nums[i]);
            if(i == currEnd) {
                currEnd = currFarthest;
                jumps ++;
            }
        }
        return jumps;
    }

    public int jumpNotOptimal(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int jump = 0;

        while (start < end) {
            for (int i = 0; i < end; i++) {
                if (nums[i] + i >= end) {
                    jump++;
                    end = i;
                    break;
                }
            }
        }
        return jump;
    }
}

package array_string.jump_game;

public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int zeros = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0){
                if (i == 0) return false;
                if (i != nums.length - 1)
                    ++zeros;
            } else {
                if (nums[i] <= zeros) ++zeros;
                else zeros = 0;
            }
        }
        return zeros == 0;
    }
}

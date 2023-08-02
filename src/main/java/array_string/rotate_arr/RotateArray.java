package array_string.rotate_arr;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;

        while (k > nums.length) {
            k -= length;
        }

        int[] tmp = new int[length];
        for (int i = 0; i < length; i++) {
            if (i < k) {
                tmp[i] = nums[length - k + i];
            } else {
                tmp[i] = nums[i - k];
            }
        }
        System.arraycopy(tmp, 0, nums, 0, length);
    }
}
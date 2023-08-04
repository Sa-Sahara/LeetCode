package array_string.rotate_arr;

public class RotateArrayOptimal {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;

        for(int i = 0, j = length - k - 1; i < j; i++, j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        for(int i = length - k, j = length - 1; i < j; i++, j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        for(int i = 0, j = length - 1; i < j; i++, j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
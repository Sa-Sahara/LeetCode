package array_string.product_of_arr_exceptitself;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] result = new int[len];
        result[0] = 1;

        for (int i = 1; i < len; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int left = 1;
        for (int i = len - 2; i >= 0; i--) {
            left *= nums[i + 1];
            result[i] *= left;
        }

        return result;
    }
}
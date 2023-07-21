package remove_duplicates_from_sorted_arr;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    //    public int removeDuplicates(int[] nums) {
//        if (nums.length <= 1) return nums.length;
//
//        int k = 1;
//
//        for (int i = 1, j = 2; i < nums.length; i++, j++) {
//            if (nums[i] <= nums[i - 1]) {
//                while (j < nums.length && nums[i] == nums[j]) {
//                    j++;
//                }
//                if (j >= nums.length) break;
//                nums[i] = nums[j];
//                i--;
//            }
//            k = i + 1;
//        }
//        System.out.println(Arrays.toString(nums));
//        return k;
//    }
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        if (nums.length <= 1)
            return k;

        int[] copy = new int[nums.length];
        copy[0] = nums[0];
        for (int i = 1, j = 0; i < nums.length; i++) {
            if (nums[i] != copy[j]) {
                copy[++j] = nums[i];
            }
            k = j + 1;
        }
        System.arraycopy(copy, 0, nums, 0, k);
        return k;
    }
}

package remove_duplicates_2;

public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;

        int[] copy = new int [nums.length];
        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            if (i < 2) {
                copy[k] = nums[i];
                ++k;
            } else {
                if (nums[i] > nums[i - 2]){
                    copy[k] = nums[i];
                    ++k;
                }
            }
        }
        System.arraycopy(copy, 0, nums, 0, k);
        return k;
    }
}

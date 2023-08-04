package binary_search;

public class BinarySearchCycle {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) return mid;
            if (target < nums[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}

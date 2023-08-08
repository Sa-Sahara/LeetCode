package binary_search.search_insert;

public class BinarySearchRecursion {
    public int searchInsert(int[] nums, int target) {
        return binarySearchInsert(nums, target, 0, nums.length - 1);
    }

    public int binarySearchInsert(int[] nums, int target, int left, int right) {
        int mid = (left + right + 1) / 2;

        if (target == nums[mid]) {
            return mid;
        }

        if (target > nums[right]) {
            return right + 1;
        }
        if (target < nums[left]) {
            return left;
        }

        if (target > nums[mid]) {
            return binarySearchInsert(nums, target, mid + 1, right);
        } else {
            return binarySearchInsert(nums, target, left, mid - 1);
        }
    }
}

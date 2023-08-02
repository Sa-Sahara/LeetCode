package divideConquer;

import bin_tree_general.TreeNode;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int index = nums.length / 2;
        TreeNode root = new TreeNode(nums[index]);

        addBranch(root, 0, index - 1, nums);
        addBranch(root, index + 1, nums.length - 1, nums);

        return root;
    }

    public void addBranch(TreeNode root, int start, int end, int[] nums) {
        int index = (start + end) / 2;
        TreeNode next = new TreeNode(nums[index]);

        if (next.val < root.val) root.left = next;
        else root.right = next;

        if (start < end) {
            addBranch(next, start, index - 1, nums);
            addBranch(next, index + 1, end, nums);
        }
    }
}
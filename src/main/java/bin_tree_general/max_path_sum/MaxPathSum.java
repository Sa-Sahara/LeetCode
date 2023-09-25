package bin_tree_general.max_path_sum;

import bin_tree_general.TreeNode;

import java.util.Stack;

public class MaxPathSum {
    public int maxPathSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;

        return pathRecursive(maxSum, 0, root) - root.val;
    }

    public int pathRecursive(int maxSum, int sum, TreeNode root) {
        if (root == null) {
            return 0;
        }

        sum += root.val;

        int l = pathRecursive(maxSum, sum, root.left);
        int r = pathRecursive(maxSum, sum, root.right);

        maxSum = Math.max(root.val + l + r, maxSum);
        maxSum = Math.max(root.val + l, maxSum);
        maxSum = Math.max(root.val + r, maxSum);

        return maxSum;
    }
}
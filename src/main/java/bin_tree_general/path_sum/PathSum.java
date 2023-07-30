package bin_tree_general.path_sum;

import bin_tree_general.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null || root.val > targetSum)
            return false;

        if (root.right ==  null && root.left == null)
            return root.val == targetSum;

        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }
}

package binary_search_tree.min_abs_diff;

import bin_tree_general.TreeNode;

import java.util.Stack;

public class Solution2 {
    Integer result = Integer.MAX_VALUE;
    Integer previous = null;
    Stack<TreeNode> stack = new Stack<>();

    public int getMinimumDifference(TreeNode root) {
        if (root != null && !stack.isEmpty()) {
            while (root.left != null) {
                stack.push(root.left);
                root = root.left;
            }

            root = stack.pop();

            if (previous != null)
                result = Math.min(result, root.val - previous);
            previous = root.val;
            root = root.right;
        }

        return result;
    }
}
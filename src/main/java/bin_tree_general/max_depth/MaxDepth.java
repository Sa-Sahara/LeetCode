package bin_tree_general.max_depth;

import bin_tree_general.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return traverse(root, 0);
    }

    public int traverse(TreeNode node, int depth) {
        if (node != null) {
            depth++;

            int left = traverse(node.left, depth);
            int right = traverse(node.right, depth);

            return Math.max(left, right);
        }
        return depth;
    }
}

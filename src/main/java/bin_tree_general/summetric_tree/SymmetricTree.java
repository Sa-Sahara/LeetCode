package bin_tree_general.summetric_tree;

import bin_tree_general.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return equals(mirror(root.left), root.right);
    }

    public TreeNode mirror(TreeNode node) {
        if (node == null) return node;

        TreeNode tmp = node.left;
        node.left = node.right;
        mirror(node.left);
        node.right = tmp;
        mirror(node.right);

        return node;
    }

    public boolean equals(TreeNode left, TreeNode right) {
        if (left == null) return right == null;
        if (right == null) return left == null;

        if (left.val != right.val) {
            return false;
        }

        return equals(left.left, right.left)
                && equals(left.right, right.right);
    }
}
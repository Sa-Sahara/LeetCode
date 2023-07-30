package bin_tree_general.invert_tree;

import bin_tree_general.TreeNode;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        else {
            TreeNode tmp = root.left;
            root.left = root.right;
            invertTree(root.left);
            root.right = tmp;
            invertTree(root.right);
        }
        return root;
    }
}

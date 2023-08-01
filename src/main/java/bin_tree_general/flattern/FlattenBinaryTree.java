package bin_tree_general.flattern;

import bin_tree_general.TreeNode;

public class FlattenBinaryTree {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        TreeNode prev = null;
        while(curr != null) {
            if(curr.left != null) {
                prev = curr.left;
                while(prev.right != null) prev = prev.right;
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
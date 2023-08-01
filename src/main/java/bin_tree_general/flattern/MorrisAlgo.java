package bin_tree_general.flattern;

import bin_tree_general.TreeNode;

// go to the left branch and add to it`s right end the right branch
// proceed with curr = curr.right

public class MorrisAlgo {
    public void flatten(TreeNode root) {

        TreeNode curr = root;
        TreeNode prev = null;
        while (curr != null) {
            if (curr.left != null) {
                prev = curr.left;
                while (prev.right != null) prev = prev.right;
                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}

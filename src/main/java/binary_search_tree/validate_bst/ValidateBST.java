package binary_search_tree.validate_bst;

import bin_tree_general.TreeNode;

import java.util.LinkedList;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        if (!okLeftRight(root))  return false;

        return okGrandChild(root.val, root.left)
                && okGrandChild(root.val, root.right);
    }

    public boolean okGrandChild(int grand, TreeNode root) {
        if (root == null) return true;
        if (!okLeftRight(root))  return false;
        if (root.left != null && root.val > grand && root.left.val < grand) return false;
        if (root.right != null && root.val < grand && root.right.val > grand) return false;
        return true;
    }

    public boolean okLeftRight(TreeNode root) {
        if (root.left != null && root.left.val >= root.val)  return false;
        if (root.right != null && root.right.val <= root.val)  return false;
        return true;
    }
}

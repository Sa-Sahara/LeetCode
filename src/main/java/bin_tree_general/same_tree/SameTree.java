package bin_tree_general.same_tree;

import bin_tree_general.TreeNode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val == q.val) {
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        } else return false;
    }
}
